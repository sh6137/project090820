package board.dao;

import java.util.List;

import board.domain.CategorytbVO;

public interface CategorytbDao {
	public abstract List<CategorytbVO> list();
	
	public abstract int delete(CategorytbVO CategorytbVO);
	
	public abstract int deleteAll();
	
	public abstract int update(CategorytbVO CategorytbVO);
	
	public abstract void insert(CategorytbVO CategorytbVO);
	
	public abstract CategorytbVO select(int cateNo);
	
}
