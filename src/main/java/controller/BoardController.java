package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	@RequestMapping(value = "/board/main-p")
	public String read(Model model) {
		model.addAttribute("boardList", boardService.list()); //조회수
		model.addAttribute("boardList2", boardService.list2()); //좋아요
		return "/board/main-p";
	}
	
	// 새글 작성
	@RequestMapping(value = "/board/write-p", method = RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("ProductVO", new ProductVO());
		return "/board/write-p";
	}

	// 새글 등록
	@RequestMapping(value = "/board/write-p", method = RequestMethod.POST)
	public String write(ProductVO productVO, Model model, MultipartHttpServletRequest mtfRequest
		) throws IOException, Exception{
		MultipartFile multipartFile = productVO.getProMultipart();
		List<MultipartFile> fileList = mtfRequest.getFiles("proMultipart");
		
		for(MultipartFile mf : fileList) {
			String originFileName = mf.getOriginalFilename();
			
			System.out.println(originFileName);
		}
		/*
		 * String saveName = "";
		 * 
		 * // 범용 식별자와 원본 이름을 합쳐 이름의 중복을 피한다. UUID uid = UUID.randomUUID(); String
		 * savedName = uid.toString() + "_" + multipartFile.getOriginalFilename();
		 */
			if(multipartFile.getOriginalFilename() != "") {
				
			
			File dir = new File("E:\\자바기반웹개발자 윤준호\\uploadedimg");
			File file = new File(dir, multipartFile.getOriginalFilename());
			
			productVO.setProFileName(multipartFile.getOriginalFilename());
			System.out.println(file.getName());
			multipartFile.transferTo(file);
			//model에 넣는 이유는 view(board/write)에서 쓰기위해서 하는 것 여기서는 필요없음
			//model.addAttribute("proFileName", file.getAbsolutePath());
			
			boardService.write(productVO);
			}else {
				boardService.write(productVO);
			}
		return "redirect:/board/list-p";

	}
	
	// List불러오기
	@RequestMapping(value = "/board/list-p")
	public String list(Model model
			,@RequestParam(required = false, defaultValue = "1") int page
			,@RequestParam(required = false, defaultValue = "1") int range) {
		int listCnt = boardService.getListCnt();
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		model.addAttribute("pagination", pagination);
		model.addAttribute("boardList3", boardService.list3(pagination)); //제품목록
			return "/board/list-p";
	}
	
	// main틀 불러오기
		@RequestMapping(value = "/board/main")
		public String readMain(Model model) {
			
			return "/board/main";
		}
}