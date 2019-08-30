package board.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import board.domain.ProductVO;
import board.service.ProductReplyService;
import reply.paging.ReplyPaging;

@Controller
//@SessionAttributes("productVO")
public class BoardController {
	/*
	 * private BoardService boardService;
	 * 
	 * public void setBoardService(BoardService boardService) { this.boardService =
	 * boardService; }
	 */
	private ProductReplyService productReplyService;
	private ReplyPaging replyPaging;
//	private ProductVO productVO;
	
	public void setProductReplyService(ProductReplyService productReplyService) {
		this.productReplyService = productReplyService;
	}
	
	public void setReplyPaging(ReplyPaging replyPaging) {
		this.replyPaging = replyPaging;
	}
	
//	public void setProductVO(ProductVO productVO) {
//		this.productVO = productVO;
//	}
	
	@RequestMapping(value = "/product/read")
	public String proRead(Model model, @RequestParam String location, 
			@RequestParam String postNo,
			@RequestParam(required=false, defaultValue="1") String pageNum) {
		model.addAttribute("location", location);
		model.addAttribute("postNo", postNo);
		model.addAttribute("pageNum", pageNum);
		return "product/read";
	}

	@RequestMapping(value = "/product/write", method = RequestMethod.GET)
	public String proWriteForm(Model model) {
		model.addAttribute("productVO", new ProductVO());
		return "product/write";
	}
	
	@RequestMapping(value = "/product/write", method = RequestMethod.POST)
	public String proWriteProc(@Valid ProductVO productVO, BindingResult bindingResult) {
		return "product/write";
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
		if(reText != null) {
			int result = productReplyService.insert(location, postNo, reText, member, memberNo);
			System.out.println(result);
		}
		model.addAttribute("location", location);
		model.addAttribute("postNo", postNo);
		replyPaging.init(productReplyService.list(location, postNo));
		model.addAttribute("replyList", replyPaging.paging(Integer.parseInt(pageNum)));
		model.addAttribute("pageList", replyPaging.getPageList());
		model.addAttribute("currentPage", pageNum);
		System.out.println("test");
		return "product/reply";
	}

	/*
	 * //모델 추가 전
	 * 
	 * @RequestMapping(value="/board/list")
	 * 
	 * @ResponseBody public String list(){ return boardService.list().toString(); }
	 * 
	 * //모델 추가 후
	 * 
	 * @RequestMapping(value="/board/list") public String list(Model model){
	 * model.addAttribute("boardList", boardService.list()); return "/board/list"; }
	 * 
	 * //읽기 기능
	 * 
	 * @RequestMapping(value="/board/read/{seq}") public String read(Model
	 * model, @PathVariable int seq){ model.addAttribute("boardVO",
	 * boardService.read(seq)); return "/board/read"; }
	 * 
	 * //새 글 쓰기
	 * 
	 * @RequestMapping(value="/board/write") public String write(){ return
	 * "/board/write"; }
	 * 
	 * //글 작성요청과 글 쓰기 요청을 구분 //새 글 작성을 위한 요청을 처리
	 * 
	 * @RequestMapping(value="/board/write", method=RequestMethod.GET) public String
	 * write(){ return "/board/write"; }
	 * 
	 * //새 글 등록을 위한 요청을 처리
	 * 
	 * @RequestMapping(value="/board/write", method=RequestMethod.POST) public
	 * String write(BoardVO boardVO){ boardService.write(boardVO); return
	 * "redirect:/board/list"; }
	 * 
	 * //예외 처리 추가 //새 글 작성을 위한 요청을 처리
	 * 
	 * @RequestMapping(value="/board/write", method=RequestMethod.GET) public String
	 * write(Model model){ model.addAttribute("boardVO", new BoardVO()); return
	 * "/board/write"; } //새 글 등록을 위한 요청을 처리
	 * 
	 * @RequestMapping(value="/board/write", method=RequestMethod.POST) public
	 * String write(@Valid BoardVO boardVO, BindingResult bindingResult){
	 * if(bindingResult.hasErrors()){ return "/board/write"; }
	 * boardService.write(boardVO); return "redirect:/board/list"; }
	 * 
	 * //글 수정
	 * 
	 * @RequestMapping(value="/board/edit/{seq}", method=RequestMethod.GET) public
	 * String edit(@PathVariable int seq, Model model){ BoardVO boardVO =
	 * boardService.read(seq); model.addAttribute("boardVO", boardVO); return
	 * "/board/edit"; }
	 * 
	 * @RequestMapping(value="/board/edit/{seq}", method=RequestMethod.POST) public
	 * String edit(
	 * 
	 * @Valid @ModelAttribute BoardVO boardVO, BindingResult result, int pwd,
	 * SessionStatus sessionStatus, Model model){ if(result.hasErrors()){ return
	 * "/board/edit"; } else{ if(boardVO.getPassword() == pwd){
	 * boardService.edit(boardVO); sessionStatus.setComplete(); return
	 * "redirect:/board/list"; } } model.addAttribute("msg", "비밀번호가 일치하지 않습니다.");
	 * return "/board/edit"; } //글 삭제 요청을 처리할 메서드
	 * 
	 * @RequestMapping(value="/board/delete/{seq}", method=RequestMethod.GET) public
	 * String delete(@PathVariable int seq, Model model){ model.addAttribute("seq",
	 * seq); return "/board/delete"; }
	 * 
	 * @RequestMapping(value="/board/delete", method=RequestMethod.POST) public
	 * String delete(int seq, int pwd, Model model){ int rowCount; BoardVO boardVO =
	 * new BoardVO(); boardVO.setSeq(seq); boardVO.setPassword(pwd);
	 * 
	 * rowCount = boardService.delete(boardVO);
	 * 
	 * if(rowCount == 0){ model.addAttribute("seq", seq); model.addAttribute("msg",
	 * "비밀번호가 일치하지 않습니다."); return "/board/delete"; } else{ return
	 * "redirect:/board/list";
	 * 
	 * } }
	 */
}
