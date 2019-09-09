package board.dao;

import java.util.List;

import board.domain.QuestiontbVO;
import board.pagination.Pagination;



public interface QuestiontbDao {
	public abstract List<QuestiontbVO> list(Pagination pagination);
	
	public abstract int delete(QuestiontbVO QuestiontbVO);
	
	public abstract int deleteAll();
	
	public abstract int update(QuestiontbVO QuestiontbVO);
	
	public abstract void insert(QuestiontbVO QuestiontbVO);
	
	public abstract QuestiontbVO select(int queno);
	
	public abstract int updateReadCount(int queno);
	
	public abstract int getListCnt();
}

