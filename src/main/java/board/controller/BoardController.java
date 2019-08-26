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
		System.out.println(productVO.getProMultipart());
		System.out.println(multipartFile.isEmpty());
		String saveName = "";
		if(!multipartFile.isEmpty()) {
			System.out.println("?"+multipartFile.getOriginalFilename());
			// 범용 식별자와 원본 이름을 합쳐 이름의 중복을 피한다.
			UUID uid = UUID.randomUUID();
			String savedName = uid.toString() + "_" + multipartFile.getOriginalFilename();

			File dir = new File("d:\\upload\\");
			File file = new File(dir, savedName);
			//System.out.println(file.getAbsolutePath());
			
			
			multipartFile.transferTo(file);
			model.addAttribute("proFileName", multipartFile.getOriginalFilename());
			//return "/board/write";	
		}
		boardService.write(productVO);
		return "/board/write";
	}
}
