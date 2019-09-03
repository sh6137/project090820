package board.dao;

import java.util.List;

import board.domain.BoardVO;

public interface BoardDao {

	public abstract int delete(BoardVO boardVO);
	
	public abstract void insert(BoardVO boardVO);
	
	public abstract String loginCheck(BoardVO boardVO);
	
	public abstract int update(BoardVO boardVO);
	
	public abstract BoardVO idCheck(String memberid);
	
	public abstract BoardVO nickCheck(String membernick);
}