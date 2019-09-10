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

import board.domain.NoticetbVO;
import board.pagination.Pagination;
import board.service.NoticetbService;


@Controller
@SessionAttributes({"noticetbVO"})

public class NoticetbController{
	private NoticetbService noticetbService;
	
	public void setNoticetbService(NoticetbService noticetbService) {
		this.noticetbService = noticetbService;
	}
	
	@RequestMapping(value="/noticeboard/list")
	public String list(Model model, HttpSession session
			, @RequestParam(required = false, defaultValue = "1") int page
			, @RequestParam(required = false, defaultValue = "1") int range
			) {
		
		
		//전체 게시글 개수
	
		  int listCnt = noticetbService.getListCnt(); 
		  int test = 2;
		 	
		//Pagination 객체생성
		Pagination pagination = new Pagination();
		 pagination.pageInfo(page, range, listCnt); 
		model.addAttribute("pagination", pagination);
		System.out.println(noticetbService.list(pagination).size());
		
		
		model.addAttribute("noticetbList", noticetbService.list(pagination));
		
		
		/* System.out.println(listCnt); */
		System.out.println("page"+page);
		System.out.println("range"+range);
		
		return "/noticeboard/list";
	
	
	}
	@RequestMapping(value="/noticeboard/read/{noticeNo}")
	public String read(Model model, @PathVariable int noticeNo) {
		
		model.addAttribute("noticetbVO", noticetbService.read(noticeNo));
		return "/noticeboard/read";
	}
	//예외 처리 추가
	
		//새 글 작성을 위한 요청을 처리
		@RequestMapping(value="/noticeboard/write", method=RequestMethod.GET)
		public String write(Model model){
			model.addAttribute("noticetbVO", new NoticetbVO());
			return "/noticeboard/write";
		}
		
		//새 글 등록을 위한 요청을 처리 
		@RequestMapping(value="/noticeboard/write", method=RequestMethod.POST)
		public String write(@Valid NoticetbVO noticetbVO, BindingResult bindingResult){
			
			if(bindingResult.hasErrors()){
				return "/noticeboard/write";
			} 		
			noticetbService.write(noticetbVO);
			
			return "redirect:/noticeboard/list";
		}
	
	//수정
	
	//글 수정
		@RequestMapping(value="/noticeboard/edit/{noticeNo}", method=RequestMethod.GET)
		public String edit(@PathVariable int noticeNo, Model model){
			 NoticetbVO noticetbVO = noticetbService.read(noticeNo);
		        model.addAttribute("noticetbVO", noticetbVO);
		        
		        return "/noticeboard/edit";
		}
		        
		@RequestMapping(value="/noticeboard/edit/{noticeNo}", method=RequestMethod.POST)
		public String edit(
		        @Valid @ModelAttribute NoticetbVO noticetbVO,
		        BindingResult result, 
		        SessionStatus sessionStatus,
		        Model model){
		        if(result.hasErrors()){
		                return "/noticeboard/edit";
		        }
				return "redirect:/noticeboard/list";
		}

		
		//글 삭제 요청을 처리할 메서드
		@RequestMapping(value="/noticeboard/delete/{noticeNo}", method=RequestMethod.GET)
		public String delete(@PathVariable int noticeNo, Model model){
			model.addAttribute("noticeNo", noticeNo);
			return "/noticeboard/delete";
		}
		@RequestMapping(value="/noticeboard/delete", method=RequestMethod.POST)
		public String delete2(int noticeNo, Model model){
			int rowCount;
			NoticetbVO noticetbVO = new NoticetbVO();
			noticetbVO.setNoticeNo(noticeNo);

			
			rowCount = noticetbService.delete(noticetbVO);
			
			if(rowCount == 0){
				model.addAttribute("noticeNo", noticeNo);
				return "/noticeboard/delete";
			}
			else{
				return "redirect:/noticeboard/list";
				
			}
		}
	}

