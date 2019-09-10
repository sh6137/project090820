package board.service;

import java.util.List;

import board.domain.ReplytbVO;
import board.pagination.Pagination;

public interface ReplytbService {
	
	public abstract List<ReplytbVO> list(Pagination pagination);
	
	public abstract int delete(int reNo);
		
	public abstract int getListCnt();
}
