package board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

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
	public String loginCheck(Model model){
		model.addAttribute("loginCheck", new BoardVO());
		return "board/login";
	}
	
	@RequestMapping(value="/board/login", method=RequestMethod.POST)
	public String loginCheck(BoardVO BoardVO) {
		boardService.loginCheck(BoardVO);
		return "redirect:/danaom";
	}
	
	
	
	
	//계정 삭제 요청을 처리할 메서드
		@RequestMapping(value="/board/delete", method=RequestMethod.GET)
		public String delete(@PathVariable String memberid, Model model){
			model.addAttribute("delete", memberid);
			return "/delete";
		}
		@RequestMapping(value="/board/delete", method=RequestMethod.POST)
		public String delete(String memberid, String memberpass, Model model){
			int rowCount;
			BoardVO boardVO = new BoardVO();
			boardVO.setMemberid(memberid);
			boardVO.setMemberpass(memberpass);
			
			rowCount = boardService.delete(boardVO);
			
			if(rowCount == 0){
				model.addAttribute("memberid", memberid);
				model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
				return "/deleteok";
			}
			else{
				return "redirect:/main";
				
			}
		}

}