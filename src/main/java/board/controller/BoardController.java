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
		return "board/reg";
	}
	
	@RequestMapping(value="/board/reg", method=RequestMethod.POST)
	public String insert(BoardVO BoardVO){
		System.out.println(BoardVO.getMemberno());
		System.out.println(BoardVO.getMemberid());
		System.out.println(BoardVO.getMemberpass());
		System.out.println(BoardVO.getMembernick());
		System.out.println(BoardVO.getMemberemail());
		System.out.println(BoardVO.getMembergender());
		System.out.println(BoardVO.getMemberbirth());
		System.out.println(BoardVO.getMemberregdt());
		System.out.println(BoardVO.getMemberadmin());
		System.out.println(BoardVO.getMemberlike());
		boardService.insert(BoardVO);
		return "redirect:/login";
	}
	
	
	//게정 삭제 요청을 처리할 메서드
		@RequestMapping(value="/board/delete", method=RequestMethod.GET)
		public String delete(@PathVariable String memberid, Model model){
			model.addAttribute("delete", memberid);
			return "/board/delete";
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
				return "/board/delete";
			}
			else{
				return "redirect:/main";
				
			}
		}

}