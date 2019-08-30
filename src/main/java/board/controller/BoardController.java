package board.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import board.domain.ProductVO;
import board.pagination.Pagination;
import board.service.BoardService;

@Controller
@SessionAttributes("productVO")
public class BoardController {
	private BoardService boardService;

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	// main불러오기
	@RequestMapping(value = "/board/main")
	public String read(Model model) {
		model.addAttribute("boardList", boardService.list()); //조회수
		model.addAttribute("boardList2", boardService.list2()); //좋아요
		return "/board/main";
	}
	
	// 새글 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("ProductVO", new ProductVO());
		return "/board/write";
	}

	// 새글 등록
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(ProductVO productVO, Model model) throws IOException, Exception{
		
		MultipartFile multipartFile = productVO.getProMultipart();

		/*
		 * String saveName = "";
		 * 
		 * // 범용 식별자와 원본 이름을 합쳐 이름의 중복을 피한다. UUID uid = UUID.randomUUID(); String
		 * savedName = uid.toString() + "_" + multipartFile.getOriginalFilename();
		 */

			File dir = new File("E:\\국비 자바 오후 최봉규\\JSP\\eclipse-jee-2019-03-R-win32-x86_64"
					+ "\\eclipse\\springwork\\project090820\\src\\main\\webapp\\resources\\img");
			File file = new File(dir, multipartFile.getOriginalFilename());
			
			productVO.setProFileName(multipartFile.getOriginalFilename());
			
			multipartFile.transferTo(file);
			
			//model에 넣는 이유는 view(board/write)에서 쓰기위해서 하는 것 여기서는 필요없음
			//model.addAttribute("proFileName", file.getAbsolutePath());
			
		boardService.write(productVO);
		
		return "/board/list";
	}
	
	// List불러오기
	@RequestMapping(value = "/board/list")
	public String list(Model model
			,@RequestParam(required = false, defaultValue = "1") int page
			,@RequestParam(required = false, defaultValue = "1") int range) {
		int listCnt = boardService.getListCnt();
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		model.addAttribute("pagination", pagination);
		model.addAttribute("boardList3", boardService.list3(pagination)); //제품목록
			return "/board/list";
	}
	
}
