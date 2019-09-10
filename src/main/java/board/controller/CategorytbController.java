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

import board.domain.CategorytbVO;
import board.service.CategorytbService;

@Controller
@SessionAttributes("categorytbVO")
public class CategorytbController {
	private CategorytbService categorytbService;

	
	public void setCategorytbService(CategorytbService categorytbService) {
		this.categorytbService = categorytbService;
	}
	
	@RequestMapping(value="/categoryboard/list")
	public String list(Model model, HttpSession session) {
		System.out.println(categorytbService);
		model.addAttribute("categorytbList", categorytbService.list());
		return "/categoryboard/list";
	}
	@RequestMapping(value="/categoryboard/read/{cateNo}")
	public String read(Model model, @PathVariable int cateNo) {
		
		model.addAttribute("categorytbVO", categorytbService.read(cateNo));
		return "/categoryboard/read";
	}
	//예외 처리 추가
		//새 글 작성을 위한 요청을 처리
		@RequestMapping(value="/categoryboard/write", method=RequestMethod.GET)
		public String write(Model model){
			
			model.addAttribute("categorytbVO", new CategorytbVO());
			
			return "/categoryboard/write";
		}
		//새 글 등록을 위한 요청을 처리 
		@RequestMapping(value="/categoryboard/write", method=RequestMethod.POST)
		public String write(@Valid CategorytbVO categorytbVO, BindingResult bindingResult){
			
			if(bindingResult.hasErrors()){
				return "/categoryboard/write";
			} 		
			categorytbService.write(categorytbVO);
			return "redirect:/categoryboard/list";
		}
	
	//수정
	
	//글 수정
		@RequestMapping(value="/categoryboard/edit/{cateNo}", method=RequestMethod.GET)
		public String edit(@PathVariable int cateNo, Model model){
		        CategorytbVO categorytbVO = categorytbService.read(cateNo);
		        model.addAttribute("categorytbVO", categorytbVO);
		        return "/categoryboard/edit";
		}
		        
		@RequestMapping(value="/categoryboard/edit/{cateNo}", method=RequestMethod.POST)
		public String edit(
		        @Valid @ModelAttribute CategorytbVO categorytbVO, 
		        BindingResult result, 
		        SessionStatus sessionStatus,
		        Model model){
				if(result.hasErrors()){
                return "/categoryboard/edit";
				}else {
					
					categorytbService.edit(categorytbVO);
			        sessionStatus.setComplete();
			        return "redirect:/categoryboard/list";
				}
		        
		        

		/* return "/categoryboard/list"; */
		}
		
		//글 삭제 요청을 처리할 메서드
		@RequestMapping(value="/categoryboard/delete/{cateNo}", method=RequestMethod.GET)
		public String delete(@PathVariable int cateNo, Model model){
			model.addAttribute("cateNo", cateNo);
			return "/categoryboard/delete";
		}
		@RequestMapping(value="/categoryboard/delete", method=RequestMethod.POST)
		public String delete1(int cateNo, Model model){
			int rowCount;
			CategorytbVO categorytbVO = new CategorytbVO();
			categorytbVO.setCateNo(cateNo);
			
			
			rowCount = categorytbService.delete(categorytbVO);
			
			if(rowCount == 0){
				model.addAttribute("cateNo", cateNo);
				return "/categoryboard/delete";
			}
			else{
				return "redirect:/categoryboard/list";
				
			}
		}
}
