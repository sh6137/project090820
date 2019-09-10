package board.service;

import java.util.List;

import board.domain.RequesttbVO;

public interface RequesttbService {
	public abstract List<RequesttbVO> list();
	
	public abstract int delete(RequesttbVO RequesttbVO);
	
	public abstract int edit(RequesttbVO RequesttbVO);
	
	public abstract void write(RequesttbVO RequesttbVO);
	
	public abstract RequesttbVO read(int reqNo);
}
