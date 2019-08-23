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

import board.domain.ProductVO;
import board.service.BoardService;

@Controller
@SessionAttributes("productVO")
public class BoardController {
	private BoardService boardService;

	public void setBoardService(BoardService boardService){
		this.boardService = boardService;
	}
	
	//불러오기
	@RequestMapping(value="/board/main")
	public String read(Model model) {
		model.addAttribute("boardList", boardService.list());
		model.addAttribute("boardList2", boardService.list2());
		return "/board/main";
	}
	
	//새글 작성
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("ProductVO", new ProductVO());
		return "/board/write";
	}
	//새글 등록
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(ProductVO productVO) {
		System.out.println(productVO.getProName());
		boardService.write(productVO);
		return "redirect:/board/write";
	}
}
