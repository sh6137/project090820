package board.service;

import java.util.List;

import board.domain.QuestiontbVO;
import board.pagination.Pagination;
import board.pagination.Search;

public interface QuestiontbService {
	public abstract List<QuestiontbVO> list(Search search);
	
	public abstract int delete(QuestiontbVO QuestiontbVO);
	
	public abstract int edit(QuestiontbVO QuestiontbVO);
	
	public abstract void write(QuestiontbVO QuestiontbVO);
	
	public abstract QuestiontbVO read(int queNo);
	
	public abstract int getListCnt(Search search);
}
