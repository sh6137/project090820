package board.service;

import java.util.List;

import board.domain.QuestioncategorytbVO;

public interface QuestioncategorytbService {
	public abstract List<QuestioncategorytbVO> list();
	
	public abstract int delete(QuestioncategorytbVO QuestioncategorytbVO);
	
	public abstract int edit(QuestioncategorytbVO QuestioncategorytbVO);
	
	public abstract void write(QuestioncategorytbVO QuestioncategorytbVO);
	
	public abstract QuestioncategorytbVO read(int quecateNum);
}
