package board.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import board.domain.ReplytbVO;
import board.pagination.Pagination;
import board.service.ReplytbService;


@Controller
@SessionAttributes({"replytbVO"})
public class ReplytbController{
	private ReplytbService replytbService;
	
	public void setReplytbService(ReplytbService replytbService) {
		this.replytbService = replytbService;
	}
	
	@RequestMapping(value="/replyboard/list")
	public String list(Model model, HttpSession session
			, @RequestParam(required = false, defaultValue = "1") int page
			, @RequestParam(required = false, defaultValue = "1") int range
			) {
		
		
		//전체 게시글 개수
	
		  int listCnt = replytbService.getListCnt(); 
		  int test = 2;
		 	
		//Pagination 객체생성
		Pagination pagination = new Pagination();
		 pagination.pageInfo(page, range, listCnt); 
		model.addAttribute("pagination", pagination);
		System.out.println(replytbService.list(pagination).size());
		
		
		model.addAttribute("replytbList", replytbService.list(pagination));
		
		
		System.out.println(listCnt);
		System.out.println("page"+page);
		System.out.println("range"+range);
		
		return "/replyboard/list";
	}
	

	
	
		//글 삭제 요청을 처리할 메서드
		@RequestMapping(value="/replyboard/list/{reNo}", method=RequestMethod.GET)
		public String delete(@PathVariable int reNo, Model model){
			model.addAttribute("reNo", reNo);
			return "/replyboard/list";
		}
	
//	  @RequestMapping(value="/replyboard/list", method=RequestMethod.POST) public
//	  String delete2(int reNo, Model model){ 
//		  int rowCount; 
//		  ReplytbVO replytbVO = new ReplytbVO(); 
//		  replytbVO.setReNo(reNo);
//	  
//	  rowCount = replytbService.delete(replytbVO);
//	  
//	  if(rowCount == 0){ model.addAttribute("reNo", reNo);
//	  
//	  return	"/replyboard/list"; 
//	  } 
//	  else{ 
//		  return "redirect:/replyboard/list";
//	  
//	  }
	}

