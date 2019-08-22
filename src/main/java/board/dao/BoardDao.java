package board.dao;

import java.util.List;

import board.domain.BoardVO;

public interface BoardDao {
	public abstract List<BoardVO> list(); //리스트
	
	public abstract int delete(BoardVO boardVO); //파일 삭제
	
	public abstract int deleteAll(); 
	
	public abstract int update(BoardVO boardVO);
	
	public abstract void insert(BoardVO boardVO);
	
	public abstract BoardVO select(int seq);
	
	public abstract int updateReadCount(int seq);
}
