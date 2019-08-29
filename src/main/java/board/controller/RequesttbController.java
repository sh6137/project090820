package board.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import board.domain.RequesttbVO;
import board.service.RequesttbService;

@Controller
@SessionAttributes("requesttbVO")
public class RequesttbController {
	private RequesttbService requesttbService;

	public void setRequesttbService(RequesttbService requesttbService) {
		this.requesttbService = requesttbService;
	}
	
	@RequestMapping(value="/requestboard/list")
	public String list(Model model, HttpSession session) {
		
		
		model.addAttribute("requesttbList", requesttbService.list());
		return "/requestboard/list";
	}
	@RequestMapping(value="/requestboard/read/{reqNo}")
	public String read(Model model, @PathVariable int reqNo) {
		
		model.addAttribute("requesttbVO", requesttbService.read(reqNo));
		return "/requestboard/read";
	}
	//예외 처리 추가
		//새 글 작성을 위한 요청을 처리
		@RequestMapping(value="/requestboard/write", method=RequestMethod.GET)
		public String write(Model model){
			model.addAttribute("requesttbVO", new RequesttbVO());
			return "/requestboard/write";
		}
		//새 글 등록을 위한 요청을 처리 
		@RequestMapping(value="/requestboard/write", method=RequestMethod.POST)
		public String write(@Valid RequesttbVO requesttbVO, BindingResult bindingResult){
			if(bindingResult.hasErrors()){
				return "/board/write";
			} 		
			requesttbService.write(requesttbVO);
			return "redirect:/requestboard/list";
		}
	
	//수정
	
	//글 수정
		@RequestMapping(value="/requestboard/edit/{reqNo}", method=RequestMethod.GET)
		public String edit(@PathVariable int reqNo, Model model){
		        RequesttbVO requesttbVO = requesttbService.read(reqNo);
		        model.addAttribute("requesttbVO", requesttbVO);
		        return "/requestboard/edit";
		}
		        
		@RequestMapping(value="/requestboard/edit/{reqNo}", method=RequestMethod.POST)
		public String edit(
		        @Valid @ModelAttribute RequesttbVO requesttbVO, 
		        BindingResult result, 
		        int pwd, 
		        SessionStatus sessionStatus,
		        Model model){
		        if(result.hasErrors()){
		                return "/requestboard/edit";
		        }
		        else{
		                if(requesttbVO.getReqPassword() == pwd){
		                        requesttbService.edit(requesttbVO);
		                        sessionStatus.setComplete();
		                        return "redirect:/requestboard/list";
		                }
		        }
		        model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
		        return "/requestboard/edit";
		}
		
		//글 삭제 요청을 처리할 메서드
		@RequestMapping(value="/requestboard/delete/{reqNo}", method=RequestMethod.GET)
		public String delete(@PathVariable int reqNo, Model model){
			model.addAttribute("reqNo", reqNo);
			return "/requestboard/delete";
		}
		@RequestMapping(value="/requestboard/delete", method=RequestMethod.POST)
		public String delete(int reqNo, int pwd, Model model){
			int rowCount;
			RequesttbVO requesttbVO = new RequesttbVO();
			requesttbVO.setReqNo(reqNo);
			requesttbVO.setReqPassword(pwd);
			
			rowCount = requesttbService.delete(requesttbVO);
			
			if(rowCount == 0){
				model.addAttribute("reqNo", reqNo);
				model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
				return "/requestboard/delete";
			}
			else{
				return "redirect:/requestboard/list";
				
			}
		}
}
