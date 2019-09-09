package board.dao;

import java.util.List;

import board.domain.ReplytbVO;
import board.pagination.Pagination;



public interface ReplytbDao {
	public abstract List<ReplytbVO> list(Pagination pagination);
	
	public abstract int delete(int reNo);
	
	public abstract int deleteAll();
		
	public abstract ReplytbVO select(int reNo);
		
	public abstract int getListCnt();
}

