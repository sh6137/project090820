package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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
		List<MultipartFile> fileList = mtfRequest.getFiles("proMultipart");
		
		String path = "C:\\Users\\KGITBANK06\\Documents\\git\\project090820\\src\\main\\webapp\\resources\\img";
		String fileName = "";
		String fileSystemName = "";
		int size = fileList.size();
		
		UUID uid = UUID.randomUUID();
		
		for (MultipartFile mf : fileList) {
			String savedName = uid.toString() + "_" + mf.getOriginalFilename();
        	String originFileName = mf.getOriginalFilename(); // 원본 파일 명
            long fileSize = mf.getSize(); // 파일 사이즈
            size--;
            System.out.println("originFileName : " + originFileName);
            System.out.println("fileSize : " + fileSize);
            if(fileName == "") {
            	fileName = originFileName;
            }else {
            	fileName += originFileName;
            }
            if(fileSystemName == "") {
            	fileSystemName = savedName;
            }else {
            	fileSystemName += savedName;
            }
            if(size > 0) {
            	fileName += "*";
            	fileSystemName += "*";
            }
            System.out.println(fileName);
            System.out.println(fileSystemName);
            mf.transferTo(new File(path, savedName));
        }
        productVO.setProFileName(fileName);
        productVO.setProFileSysName(fileSystemName);
        boardService.write(productVO);
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