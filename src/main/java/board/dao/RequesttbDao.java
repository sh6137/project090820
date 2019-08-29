package board.dao;

import java.util.List;

import board.domain.RequesttbVO;



public interface RequesttbDao {
	public abstract List<RequesttbVO> list();
	
	public abstract int delete(RequesttbVO RequesttbVO);
	
	public abstract int deleteAll();
	
	public abstract int update(RequesttbVO RequesttbVO);
	
	public abstract void insert(RequesttbVO RequesttbVO);
	
	public abstract RequesttbVO select(int reqno);
	
	public abstract int updateReadCount(int reqno);
}

