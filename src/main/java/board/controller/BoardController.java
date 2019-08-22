package board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.dto.NoticeBoardDto;
import board.service.NoticeBoardService;

@Controller
@RequestMapping("/board/*") //공통적인 mapping
public class BoardController {
	
	@Autowired
	NoticeBoardService noticeboardService;
	
	@RequestMapping("list.do") // 세부적인 mapping
	public ModelAndView list() throws Exception{
		List<NoticeBoardDto> list=noticeboardService.listAll(0, 0, "",""); //목록
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/list"); //이동할 페이지 지정
		Map<String,Object> map = new HashMap<>();
		map.put("list", list); //맵에 자료저장
		mav.addObject("map",map); //데이터 저장
		return mav;
	}
}
