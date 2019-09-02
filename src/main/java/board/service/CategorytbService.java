package board.service;

import java.util.List;

import board.domain.CategorytbVO;

public interface CategorytbService {
	public abstract List<CategorytbVO> list();
	
	public abstract int delete(CategorytbVO CategorytbVO);
	
	public abstract int edit(CategorytbVO CategorytbVO);
	
	public abstract void write(CategorytbVO CategorytbVO);
	
	public abstract CategorytbVO read(int cateNo);

}
