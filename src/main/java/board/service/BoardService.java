package board.service;

import java.util.List;

import board.domain.BoardVO;

public interface BoardService {

	public abstract int delete(BoardVO boardVO); //0이면 그대로! //1이면 삭제

	public abstract void insert(BoardVO boardVO);

	public abstract String loginCheck(BoardVO boardVO);
	
	public abstract int update(BoardVO boardVO);
}