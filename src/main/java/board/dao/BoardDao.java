package board.dao;

import java.util.List;

import board.domain.ProductVO;

public interface BoardDao {
	
	public abstract List<ProductVO> list();
	
	public abstract List<ProductVO> list2();
	
	public abstract void insert(ProductVO productVO);

}
