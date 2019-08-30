package board.service;

import java.util.List;

import board.domain.ProductVO;
import board.pagination.Pagination;

public interface BoardService {
	
	//조회수
	public abstract List<ProductVO> list();
	
	//좋아요
	public abstract List<ProductVO> list2();
	
	public abstract void write(ProductVO productVO);

	//제품목록
	public abstract List<ProductVO> list3(Pagination pagination);
	
	//페이징
	public abstract int getListCnt();
	
}