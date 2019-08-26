package board.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import board.domain.ProductVO;
import board.service.BoardService;

@Controller
@SessionAttributes("productVO")
public class BoardController {
	private BoardService boardService;

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	// 불러오기
	@RequestMapping(value = "/board/main")
	public String read(Model model) {
		model.addAttribute("boardList", boardService.list());
		model.addAttribute("boardList2", boardService.list2());
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
		
		if(!multipartFile.isEmpty()) {
			File file = new File(multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);
			model.addAttribute("proFileName", multipartFile.getOriginalFilename());
		}
		
		System.out.println();
		
		boardService.write(productVO);
		
		return "redirect:/board/write";
	}
	
	//파일 이름 겹치지 않도록 처리하는 함수
	@Resource(name="uploadPath")
	private String uploadFile(String originalName, byte[] fileData) throws Exception{
		  // 범용 식별자를 만들어 이름 앞에 추가 해 줄 것임.
		  UUID uid = UUID.randomUUID();

		  // 범용 식별자와 원본 이름을 합쳐 이름의 중복을 피한다.
		  String savedName = uid.toString() + "_" + originalName;

		  // 파일이 저장될 경로와 새롭게 생성한 파일 이름으로 파일 객체를 만든다.
		  File target = new File("uploadPath", savedName);

		  // 원본 파일을 지정한 경로의 파일 객체로 복사한다.
		  FileCopyUtils.copy(fileData, target);

		  return savedName;
	}
}
