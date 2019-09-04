package board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
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
		return "/board/reg";
	}
	
	@RequestMapping(value="/board/reg", method=RequestMethod.POST)
	public String insert(BoardVO BoardVO){
		boardService.insert(BoardVO);
		return "/board/regok";
	}
	
	//로그인 체크를 위해 요청 처리
	@RequestMapping(value="/board/login", method=RequestMethod.GET)
	public String loginCheck(){
		return "/board/login";
	}
	
	@RequestMapping(value="/board/login", method=RequestMethod.POST)
	public String loginCheck(BoardVO boardVO, Model model,  HttpSession session, HttpServletResponse response) throws IOException {
		//String memberpass = request.getparameter("memberpass")의 개념이랑 똑같음.
		String memberpass = boardService.loginCheck(boardVO);
		int re = 1;
		if(memberpass == null) {
			re = 0;
		}
		model.addAttribute("re", re);
		if(memberpass != null) {
			if(memberpass.equals(boardVO.getMemberpass())){
				session.setAttribute("pass", boardVO.getMemberpass());
				model.addAttribute("boardVO", boardVO); //이것만 설정해두면 세션은 자동으로 설정될듯. 정 모르겠으면 10번 볼것!
				return "/board/danaom"; //로그인 된 창으로 구현! //redirect:board/danaom
			} 
			else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('ID와 비밀번호를 확인하세요!.'); history.go(-1);</script>");
				out.flush();
				return "/board/login"; //로그인 검증 창으로 리다이렉트 시킨다!
			}	
		}
		return "/board/login";
	}
	
	//계정 삭제 요청을 처리할 메서드
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public String delete(){
			return "/board/delete";
	}
	@RequestMapping(value="/board/delete", method=RequestMethod.POST)
	public String delete(@RequestParam(value="memberpass") String memberpass, Model model, HttpSession session
			){
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
		return "/board/delete";
			}
	else{
		session.invalidate();
		return "/board/deleteok";
			}
	}	
	
//	//아이디 중복 확인 메소드!
//	public String idCheck() {}
//	
//	//닉네임 중복 확인 메소드!
//	public String nickCheck() {}
//	
//	//비밀번호 찾기 혹은 확인 메소드!
//	public String findPassword() {}
	
	
	//비밀번호 변경 요청 처리할 메소드
	@RequestMapping(value="/board/changeinfo", method=RequestMethod.GET)
	public String update(){
				return "/board/changeinfo";
		}
	
	@RequestMapping(value="/board/changeinfo", method=RequestMethod.POST)
	public String update(@RequestParam(value="memberpass") String memberpass, String memberemail, String membernick, HttpSession session, BoardVO boardVO) {
		int rowCount = 0;
		
		boardVO = (BoardVO)session.getAttribute("boardVO");
//		System.out.println(boardVO.getMemberpass());
//		System.out.println(boardVO.getMemberemail());
//		System.out.println(boardVO.getMembernick());
		if(boardVO.getMemberpass().equals(memberpass)) {
			rowCount = boardService.update(boardVO);
		}
		
		else if(boardVO.getMemberemail().equals(memberemail)) {
			rowCount = boardService.update(boardVO);
		}
		
		else if(boardVO.getMembernick().equals(membernick)) {
			rowCount = boardService.update(boardVO);
		}
		
		if(rowCount == 0){
			return "/board/changeinfo";
				}
		else return "/board/changeinfook";
	}
	
	@RequestMapping(value="/board/idCheck")
	public String idCheck(Model model, String id) {
		System.out.println("확인");
		BoardVO boardVO = boardService.idCheck(id);
		if(boardVO != null) {
			model.addAttribute("check", 0);
		}else {
			model.addAttribute("check", 1);
		}
		model.addAttribute("id", id);
		
		return "/board/idCheck";
	}
	
	@RequestMapping(value="/board/nickCheck")
	public String nickCheck(Model model, String nick) {
		System.out.println("확인");
		BoardVO boardVO = boardService.nickCheck(nick);
		if(boardVO != null) {
			model.addAttribute("check", 0);
		}else {
			model.addAttribute("check", 1);
		}
		model.addAttribute("nick", nick);
		
		return "/board/nickCheck";
	}
	
}	
	

