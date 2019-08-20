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
	
	//모델 추가 전
/*	@RequestMapping(value="/board/list")
	@ResponseBody
	public String list(){
		return boardService.list().toString();
	}*/
	
	//모델 추가 후
	@RequestMapping(value="/board/list")
	public String list(Model model){
		model.addAttribute("boardList", boardService.list());
		return "/board/list";
	}
	
	//읽기 기능
	@RequestMapping(value="/board/read/{seq}")
	public String read(Model model, @PathVariable int seq){
	        model.addAttribute("boardVO", boardService.read(seq));
	        return "/board/read";
	}
	
	//새 글 쓰기
/*	@RequestMapping(value="/board/write")
	public String write(){
		return "/board/write";
	}*/
	
	//글 작성요청과 글 쓰기 요청을 구분
	//새 글 작성을 위한 요청을 처리
/*	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String write(){
		return "/board/write";
	}

	//새 글 등록을 위한 요청을 처리 
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(BoardVO boardVO){
		boardService.write(boardVO);
		return "redirect:/board/list";
	}*/
	
	//예외 처리 추가
	//새 글 작성을 위한 요청을 처리
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String write(Model model){
		model.addAttribute("boardVO", new BoardVO());
		return "/board/write";
	}
	//새 글 등록을 위한 요청을 처리 
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(@Valid BoardVO boardVO, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "/board/write";
		} 		
		boardService.write(boardVO);
		return "redirect:/board/list";
	}
	
	//글 수정
	@RequestMapping(value="/board/edit/{seq}", method=RequestMethod.GET)
	public String edit(@PathVariable int seq, Model model){
	        BoardVO boardVO = boardService.read(seq);
	        model.addAttribute("boardVO", boardVO);
	        return "/board/edit";
	}
	        
	@RequestMapping(value="/board/edit/{seq}", method=RequestMethod.POST)
	public String edit(
	        @Valid @ModelAttribute BoardVO boardVO, 
	        BindingResult result, 
	        int pwd, 
	        SessionStatus sessionStatus,
	        Model model){
	        if(result.hasErrors()){
	                return "/board/edit";
	        }
	        else{
	                if(boardVO.getPassword() == pwd){
	                        boardService.edit(boardVO);
	                        sessionStatus.setComplete();
	                        return "redirect:/board/list";
	                }
	        }
	        model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
	        return "/board/edit";
	}
	//글 삭제 요청을 처리할 메서드
	@RequestMapping(value="/board/delete/{seq}", method=RequestMethod.GET)
	public String delete(@PathVariable int seq, Model model){
		model.addAttribute("seq", seq);
		return "/board/delete";
	}
	@RequestMapping(value="/board/delete", method=RequestMethod.POST)
	public String delete(int seq, int pwd, Model model){
		int rowCount;
		BoardVO boardVO = new BoardVO();
		boardVO.setSeq(seq);
		boardVO.setPassword(pwd);
		
		rowCount = boardService.delete(boardVO);
		
		if(rowCount == 0){
			model.addAttribute("seq", seq);
			model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
			return "/board/delete";
		}
		else{
			return "redirect:/board/list";
			
		}
	}

}
