package board.dao;

import java.util.List;

import board.domain.NoticetbVO;
import board.pagination.Pagination;



public interface NoticetbDao {
	public abstract List<NoticetbVO> list(Pagination pagination);
	
	public abstract int delete(NoticetbVO NoticetbVO);
	
	public abstract int deleteAll();
	
	public abstract int update(NoticetbVO NoticetbVO);
	
	public abstract void insert(NoticetbVO NoticetbVO);
	
	public abstract NoticetbVO select(int noticeno);
	
	public abstract int updateReadCount(int noticeno);
	
	public abstract int getListCnt();
}

