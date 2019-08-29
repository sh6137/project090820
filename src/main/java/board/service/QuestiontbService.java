package board.service;

import java.util.List;

import board.domain.QuestiontbVO;
import board.pagination.Pagination;

public interface QuestiontbService {
	public abstract List<QuestiontbVO> list(Pagination pagination);
	
	public abstract int delete(QuestiontbVO QuestiontbVO);
	
	public abstract int edit(QuestiontbVO QuestiontbVO);
	
	public abstract void write(QuestiontbVO QuestiontbVO);
	
	public abstract QuestiontbVO read(int queNo);
	
	public abstract int getListCnt();
}
