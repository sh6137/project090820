package board.dao;

import board.domain.BoardVO;

public interface BoardDao {

	public abstract int delete(BoardVO boardVO);
	
	public abstract void insert(BoardVO boardVO);
	
	public abstract int loginCheck(BoardVO boardVO);
	
}