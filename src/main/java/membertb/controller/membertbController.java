package membertb.controller;

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
import membertb.domain.membertbVO;
import membertb.service.membertbService;

@Controller
@SessionAttributes("membertbVO")
public class membertbController {
	private membertbService membertbService;

	public void setmembertbService(membertbService membertbService){
		this.membertbService = membertbService;
	}
	
	//예외 처리 추가
	//회원가입을 위한 요청을 처리
	@RequestMapping(value="/membertb/reg", method=RequestMethod.GET)
	public String insert(Model model){
		model.addAttribute("insert", new membertbVO());
		return "/membertb/reg";
	}
	
	@RequestMapping(value="/membertb/reg", method=RequestMethod.POST)
	public String insert(membertbVO membertbVO){
		membertbService.insert(membertbVO);
		return "/membertb/regok";
	}
	
	//로그인 체크를 위해 요청 처리
	@RequestMapping(value="/membertb/login", method=RequestMethod.GET)
	public String loginCheck(){
		return "/membertb/login";
	}
	
	@RequestMapping(value="/membertb/login", method=RequestMethod.POST)
	public String loginCheck(membertbVO membertbVO, Model model,  HttpSession session, HttpServletResponse response) throws IOException {
		//String memberpass = request.getparameter("memberpass")의 개념이랑 똑같음.
		String memberpass = membertbService.loginCheck(membertbVO);
		
		int re = 1;
		if(memberpass == null) {
			re = 0;
		}
		
		model.addAttribute("re", re);
		
		if(memberpass != null) {
			if(memberpass.equals(membertbVO.getMemberpass())){
				session.setAttribute("pass", membertbVO.getMemberpass());
				model.addAttribute("membertbVO", membertbVO); //이것만 설정해두면 세션은 자동으로 설정될듯. 정 모르겠으면 10번 볼것!
				return "/membertb/danaom"; //로그인 된 창으로 구현! //redirect:membertb/danaom
			} 
			else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('ID와 비밀번호를 확인하세요!.'); history.go(-1);</script>");
				out.flush();
				return "/membertb/login"; //로그인 검증 창으로 리다이렉트 시킨다!
			}	
		}
		return "/membertb/login";
	}
	
	//계정 삭제 요청을 처리할 메서드
	@RequestMapping(value="/membertb/delete", method=RequestMethod.GET)
	public String delete(){
			return "/membertb/delete";
	}
	@RequestMapping(value="/membertb/delete", method=RequestMethod.POST)
	public String delete(@RequestParam(value="memberpass") String memberpass, Model model, HttpSession session
			){
		//@RequestParam으로 요청받으면, 밸류값을 받아온다. 그리고 세션객체는 멤버변수에 추가만 해주면 알아서 지정될거임.
		int rowCount = 0;
			
	membertbVO membertbVO = (membertbVO) session.getAttribute("membertbVO");
	System.out.println(membertbVO.getMemberpass());
			
	if(membertbVO.getMemberpass().equals(memberpass)) {
		rowCount = membertbService.delete(membertbVO);
	}
			
	if(rowCount == 0){
//		model.addAttribute("memberid", );
//		model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
		return "/membertb/delete";
			}
	else{
		session.invalidate();
		return "/membertb/deleteok";
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
	@RequestMapping(value="/membertb/changeinfo", method=RequestMethod.GET)
	public String update(){
				return "/membertb/changeinfo";
		}
	
	@RequestMapping(value="/membertb/changeinfo", method=RequestMethod.POST)
	public String update(@RequestParam(value="memberpass") String memberpass, String memberemail, String membernick, HttpSession session, membertbVO membertbVO) {
		int rowCount = 0;
		
		membertbVO = (membertbVO)session.getAttribute("membertbVO");
//		System.out.println(membertbVO.getMemberpass());
//		System.out.println(membertbVO.getMemberemail());
//		System.out.println(membertbVO.getMembernick());
		if(membertbVO.getMemberpass().equals(memberpass)) {
			rowCount = membertbService.update(membertbVO);
		}
		
		else if(membertbVO.getMemberemail().equals(memberemail)) {
			rowCount = membertbService.update(membertbVO);
		}
		
		else if(membertbVO.getMembernick().equals(membernick)) {
			rowCount = membertbService.update(membertbVO);
		}
		
		if(rowCount == 0){
			return "/membertb/changeinfo";
				}
		else return "/membertb/changeinfook";
	}
	
	@RequestMapping(value="/membertb/idCheck")
	public String idCheck(Model model, String id) {
		System.out.println("확인");
		membertbVO membertbVO = membertbService.idCheck(id);
		if(membertbVO != null) {
			model.addAttribute("check", 0);
		}else {
			model.addAttribute("check", 1);
		}
		model.addAttribute("id", id);
		
		return "/membertb/idCheck";
	}
	
	@RequestMapping(value="/membertb/nickCheck")
	public String nickCheck(Model model, String nick) {
		System.out.println("확인");
		membertbVO membertbVO = membertbService.nickCheck(nick);
		if(membertbVO != null) {
			model.addAttribute("check", 0);
		}else {
			model.addAttribute("check", 1);
		}
		model.addAttribute("nick", nick);
		
		return "/membertb/nickCheck";
	}
	
}	
	

