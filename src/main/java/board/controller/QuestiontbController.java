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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import board.domain.QuestioncategorytbVO;
import board.domain.QuestiontbVO;
import board.pagination.Pagination;
import board.pagination.Search;
import board.service.QuestioncategorytbService;
import board.service.QuestiontbService;

@Controller
@SessionAttributes({"questiontbVO", "questioncategorytbVO"})

public class QuestiontbController {
	private QuestiontbService questiontbService;
	
	private QuestioncategorytbService questioncategorytbService;
	
	public void setQuestioncategorytbService(QuestioncategorytbService questioncategorytbService) {
		this.questioncategorytbService = questioncategorytbService;
	}

	public void setQuestiontbService(QuestiontbService questiontbService) {
		this.questiontbService = questiontbService;
	}
	
	@RequestMapping(value="/questionboard/list")
	public String list(Model model, HttpSession session
			, @RequestParam(required = false, defaultValue = "1") int page
			, @RequestParam(required = false, defaultValue = "1") int range
			, @RequestParam(required = false, defaultValue = "title") String searchType
			, @RequestParam(required = false) String keyword
			
			) {
		
		/*
		 * System.out.println(questiontbService.list().get(0).getQueRegDt());
		 * System.out.println(questiontbService.list().get(0).getQueNo());
		 * System.out.println(questiontbService.list().get(0).getQueNo());
		 */
		
		Search search = new Search();

		search.setSearchType(searchType);

		search.setKeyword(keyword);
		System.out.println(searchType);
		
		System.out.println(keyword);
		//전체 게시글 개수

		int listCnt = questiontbService.getListCnt(search);
		int test = 2;
		//Pagination 객체생성
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		search.pageInfo(page, range, listCnt);

		model.addAttribute("pagination", search);
	//	System.out.println(questiontbService.list(pagination).size());
		
		model.addAttribute("questiontbVO", new QuestiontbVO());
		model.addAttribute("questiontbList", questiontbService.list(search));
		System.out.println("list:"+questiontbService.list(search));
		
		System.out.println(listCnt);
		System.out.println("page"+page);
		System.out.println("range"+range);
		
		return "/questionboard/list";
	
	
	}
	@RequestMapping(value="/questionboard/read/{queNo}")
	public String read(Model model, @PathVariable int queNo) {
		
		model.addAttribute("questiontbVO", questiontbService.read(queNo));
		return "/questionboard/read";
	}
	//예외 처리 추가
		//새 글 작성을 위한 요청을 처리
		@RequestMapping(value="/questionboard/write", method=RequestMethod.GET)
		public String write(Model model){
			System.out.println(questioncategorytbService);
			System.out.println(questioncategorytbService.list());
			System.out.println(questioncategorytbService.list().get(0));
			System.out.println(questioncategorytbService.list().get(0).getQuecateCat());
			model.addAttribute("questiontbVO", new QuestiontbVO());
			model.addAttribute("questioncategorytbVO", new QuestioncategorytbVO());
			
			model.addAttribute("questioncategorytbList", questioncategorytbService.list());
			
			return "/questionboard/write";
		}
		//새 글 등록을 위한 요청을 처리 
		@RequestMapping(value="/questionboard/write", method=RequestMethod.POST)
		public String write(@Valid QuestiontbVO questiontbVO,@Valid QuestioncategorytbVO questioncategorytbVO, BindingResult bindingResult){
			
			if(bindingResult.hasErrors()){
				return "/questionboard/write";
			} 		
			questiontbService.write(questiontbVO);
			
			questioncategorytbService.list();
			
			return "redirect:/questionboard/list";
		}
	
	//수정
	
	//글 수정
		@RequestMapping(value="/questionboard/edit/{queNo}", method=RequestMethod.GET)
		public String edit(@PathVariable int queNo, Model model){
		        QuestiontbVO questiontbVO = questiontbService.read(queNo);
		        model.addAttribute("questiontbVO", questiontbVO);
		        
		        model.addAttribute("questioncategorytbVO", new QuestioncategorytbVO());
				model.addAttribute("questioncategorytbList", questioncategorytbService.list());
		        
		        return "/questionboard/edit";
		}
		        
		@RequestMapping(value="/questionboard/edit/{queNo}", method=RequestMethod.POST)
		public String edit(
		        @Valid @ModelAttribute QuestiontbVO questiontbVO, @Valid QuestioncategorytbVO questioncategorytbVO,
		        BindingResult result, 
		        int pwd, 
		        SessionStatus sessionStatus,
		        Model model){
		        if(result.hasErrors()){
		                return "/questionboard/edit";
		        }
		        else{
		                if(questiontbVO.getQuePassword() == pwd){
		                        questiontbService.edit(questiontbVO);
		                        sessionStatus.setComplete();
		                        return "redirect:/questionboard/list";
		                }
		        }
		        questioncategorytbService.list();
		        model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
		        return "/questionboard/edit";
		}
		
		//글 삭제 요청을 처리할 메서드
		@RequestMapping(value="/questionboard/delete/{queNo}", method=RequestMethod.GET)
		public String delete(@PathVariable int queNo, Model model){
			model.addAttribute("queNo", queNo);
			return "/questionboard/delete";
		}
		@RequestMapping(value="/questionboard/delete", method=RequestMethod.POST)
		public String delete(int queNo, int pwd, Model model){
			int rowCount;
			QuestiontbVO questiontbVO = new QuestiontbVO();
			questiontbVO.setQueNo(queNo);
			questiontbVO.setQuePassword(pwd);
			
			rowCount = questiontbService.delete(questiontbVO);
			
			if(rowCount == 0){
				model.addAttribute("queNo", queNo);
				model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
				return "/questionboard/delete";
			}
			else{
				return "redirect:/questionboard/list";
				
			}
		}
}
