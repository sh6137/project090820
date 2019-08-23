package board.service;

import java.util.List;

import board.domain.ProductVO;

public interface BoardService {
	
	public abstract List<ProductVO> list();
	
	public abstract List<ProductVO> list2();
}
