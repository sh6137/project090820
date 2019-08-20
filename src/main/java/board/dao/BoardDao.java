package board.dao;

import board.domain.ProductVO;

public interface BoardDao {

	public abstract Object call(ProductVO productVO);
}
