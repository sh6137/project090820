package board.dao;

import java.util.List;

import board.domain.QuestioncategorytbVO;

public interface QuestioncategorytbDao {
	public abstract List<QuestioncategorytbVO> list();
	
	public abstract int delete(QuestioncategorytbVO QuestioncategorytbVO);
	
	public abstract int deleteAll();
	
	public abstract int update(QuestioncategorytbVO QuestioncategorytbVO);
	
	public abstract void insert(QuestioncategorytbVO QuestioncategorytbVO);
	
	public abstract QuestioncategorytbVO select(int quecateNum);
	
}
