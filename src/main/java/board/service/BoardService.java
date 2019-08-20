package board.service;

import board.domain.ProductVO;

public interface BoardService {
	
	public abstract Object call(ProductVO productVO);
}
