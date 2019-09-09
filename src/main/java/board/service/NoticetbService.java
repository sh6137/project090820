package board.service;

import java.util.List;

import board.domain.NoticetbVO;
import board.pagination.Pagination;

public interface NoticetbService {
	public abstract List<NoticetbVO> list(Pagination pagination);
	
	public abstract int delete(NoticetbVO NoticetbVO);
	
	public abstract int edit(NoticetbVO NoticetbVO);
	
	public abstract void write(NoticetbVO NoticetbVO);
	
	public abstract NoticetbVO read(int noticeNo);
	
	public abstract int getListCnt();
}
