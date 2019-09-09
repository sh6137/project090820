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

import board.domain.QuestioncategorytbVO;
import board.service.QuestioncategorytbService;

@Controller
@SessionAttributes("questioncategorytbVO")
public class QuestioncategorytbController {
	private QuestioncategorytbService questioncategorytbService;

	public void setQuestioncategorytbService(QuestioncategorytbService questioncategorytbService) {
		this.questioncategorytbService = questioncategorytbService;
	}
	
	@RequestMapping(value="/questioncategoryboard/list")
	public String list(Model model, HttpSession session) {
		System.out.println(questioncategorytbService);
		model.addAttribute("questioncategorytbList", questioncategorytbService.list());
		return "/questioncategoryboard/list";
	}
	@RequestMapping(value="/questioncategoryboard/read/{quecateNum}")
	public String read(Model model, @PathVariable int quecateNum) {
		
		model.addAttribute("questioncategorytbVO", questioncategorytbService.read(quecateNum));
		return "/questioncategoryboard/read";
	}
	//예외 처리 추가
		//새 글 작성을 위한 요청을 처리
		@RequestMapping(value="/questioncategoryboard/write", method=RequestMethod.GET)
		public String write(Model model){
			
			model.addAttribute("questioncategorytbVO", new QuestioncategorytbVO());
			
			return "/questioncategoryboard/write";
		}
		//새 글 등록을 위한 요청을 처리 
		@RequestMapping(value="/questioncategoryboard/write", method=RequestMethod.POST)
		public String write(@Valid QuestioncategorytbVO questioncategorytbVO, BindingResult bindingResult){
			
			if(bindingResult.hasErrors()){
				return "/questioncategoryboard/write";
			} 		
			questioncategorytbService.write(questioncategorytbVO);
			return "redirect:/questioncategoryboard/list";
		}
	
	//수정
	
	//글 수정
		@RequestMapping(value="/questioncategoryboard/edit/{quecateNum}", method=RequestMethod.GET)
		public String edit(@PathVariable int quecateNum, Model model){
		        QuestioncategorytbVO questioncategorytbVO = questioncategorytbService.read(quecateNum);
		        model.addAttribute("questioncategorytbVO", questioncategorytbVO);
		        return "/questioncategoryboard/edit";
		}
		        
		@RequestMapping(value="/questioncategoryboard/edit/{quecateNum}", method=RequestMethod.POST)
		public String edit(
		        @Valid @ModelAttribute QuestioncategorytbVO questioncategorytbVO, 
		        BindingResult result, 
		        int pwd, 
		        SessionStatus sessionStatus,
		        Model model){
		        if(result.hasErrors()){
		                return "/questioncategoryboard/edit";
		        }
		        else{
		                if(questioncategorytbVO.getQuecatePass() == pwd){
		                        questioncategorytbService.edit(questioncategorytbVO);
		                        sessionStatus.setComplete();
		                        return "redirect:/questioncategoryboard/list";
		                }
		        }
		        model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
		        return "/questioncategoryboard/edit";
		}
		
		//글 삭제 요청을 처리할 메서드
		@RequestMapping(value="/questioncategoryboard/delete/{quecateNum}", method=RequestMethod.GET)
		public String delete(@PathVariable int quecateNum, Model model){
			model.addAttribute("quecateNum", quecateNum);
			return "/questioncategoryboard/delete";
		}
		@RequestMapping(value="/questioncategoryboard/delete", method=RequestMethod.POST)
		public String delete(int quecateNum, int pwd, Model model){
			int rowCount;
			QuestioncategorytbVO questioncategorytbVO = new QuestioncategorytbVO();
			questioncategorytbVO.setQuecateNum(quecateNum);
			questioncategorytbVO.setQuecatePass(pwd);
			
			rowCount = questioncategorytbService.delete(questioncategorytbVO);
			
			if(rowCount == 0){
				model.addAttribute("quecateNum", quecateNum);
				model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
				return "/questioncategoryboard/delete";
			}
			else{
				return "redirect:/questioncategoryboard/list";
				
			}
		}
}
