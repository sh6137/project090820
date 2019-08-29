package board.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import board.domain.BoardVO;
import board.service.BoardService;

@Controller
@SessionAttributes("boardVO")
public class BoardController {
	private BoardService boardService;

	public void setBoardService(BoardService boardService){
		this.boardService = boardService;
	}
	
	//예외 처리 추가
	//회원가입을 위한 요청을 처리
	@RequestMapping(value="/board/reg", method=RequestMethod.GET)
	public String insert(Model model){
		model.addAttribute("insert", new BoardVO());
		return "/reg";
	}
	
	@RequestMapping(value="/board/reg", method=RequestMethod.POST)
	public String insert(BoardVO BoardVO){
		boardService.insert(BoardVO);
		return "redirect:/regok";
	}
	
	//로그인 체크를 위해 요청 처리
	@RequestMapping(value="/board/login", method=RequestMethod.GET)
	public String loginCheck(){
		return "board/login";
	}
	
	@RequestMapping(value="/board/login", method=RequestMethod.POST)
	public String loginCheck(BoardVO boardVO, Model model,  HttpSession session) {
		//String memberpass = request.getparameter("memberpass")의 개념이랑 똑같음.
		String memberpass = boardService.loginCheck(boardVO);
		if(memberpass.equals(boardVO.getMemberpass())){
			
			session.setAttribute("pass", boardVO.getMemberpass());
			
			model.addAttribute("boardVO", boardVO); //이것만 설정해두면 세션은 자동으로 설정될듯. 정 모르겠으면 10번 볼것!
			return "redirect:/danaom"; //로그인 된 창으로 구현!
		} else 
			return "redirect:/board/login"; //로그인 검증 창으로 리다이렉트 시킨다!
	}
	
	//계정 삭제 요청을 처리할 메서드
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public String delete(){
			return "board/delete";
	}
	@RequestMapping(value="/board/delete", method=RequestMethod.POST)
	public String delete(@RequestParam(value="memberpass") String memberpass, Model model, HttpSession session){
	//@RequestParam으로 요청받으면, 밸류값을 받아온다. 그리고 세션객체는 멤버변수에 추가만 해주면 알아서 지정될거임.
	int rowCount = 0;
			
	BoardVO boardVO = (BoardVO) session.getAttribute("boardVO");
	System.out.println(boardVO.getMemberpass());
			
	if(boardVO.getMemberpass().equals(memberpass)) {
		rowCount = boardService.delete(boardVO);
	}
			
	if(rowCount == 0){
//		model.addAttribute("memberid", );
//		model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
		return "board/delete";
			}
	else{
		session.invalidate();
		return "board/deleteok";
			}
		}	
	
	//비밀번호 변경 요청 처리할 메소드
	@RequestMapping(value="/board/changepassword", method=RequestMethod.GET)
	public String update(){
				return "board/changepassword";
		}
	
	@RequestMapping(value="/board/changepassword", method=RequestMethod.POST)
	public String update(@RequestParam(value="memberpass") String memberpass, HttpSession session, BoardVO boardVO) {
		int rowCount = 0;
		
		boardVO = (BoardVO)session.getAttribute("boardVO");
		System.out.println(boardVO.getMemberpass());
				
		if(boardVO.getMemberpass().equals(memberpass)) {
			rowCount = boardService.update(boardVO);
		}
		
		if(rowCount == 0){
			return "board/changepassword";
				}
		else return "board/changepasswordok";
	}
}	
	

