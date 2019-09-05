package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import board.service.ProductReplyService;
import reply.paging.ReplyPaging;

@Controller
//@SessionAttributes("productVO")
public class ProductController {
	private ProductReplyService productReplyService;
	private ReplyPaging replyPaging;
	
	public void setProductReplyService(ProductReplyService productReplyService) {
		this.productReplyService = productReplyService;
	}
	
	public void setReplyPaging(ReplyPaging replyPaging) {
		this.replyPaging = replyPaging;
	}
	
	
	@RequestMapping(value = "/product/read")
	public String proRead(Model model, 
			@RequestParam String location, 
			@RequestParam String postNo) {
		model.addAttribute("location", location);
		model.addAttribute("postNo", postNo);
		return "product/read";
	}
	
	@RequestMapping(value = "/product/reply")
	public String proReply(Model model, 
			@RequestParam(required=false, defaultValue="1") String pageNum,
			@RequestParam String location, 
			@RequestParam String postNo,
			@RequestParam(required=false) String reText) {
		System.out.println(reText);
		String member = "tmpMember";
		String memberNo = "15";
		int result = 1;
		if(reText != null) {
			result = productReplyService.insert(location, postNo, reText, member, memberNo);
			System.out.println(result);
		}
		model.addAttribute("result", result);
		model.addAttribute("location", location);
		model.addAttribute("postNo", postNo);
		replyPaging.init(productReplyService.list(location, postNo));
		model.addAttribute("replyList", replyPaging.paging(Integer.parseInt(pageNum)));
		model.addAttribute("pageList", replyPaging.getPageList());
		model.addAttribute("currentPage", pageNum);
		return "product/reply";
	}
}
