package board.service;

import board.domain.BoardVO;

public interface BoardService {

	public abstract int delete(BoardVO boardVO);

	public abstract void insert1(BoardVO boardVO);

	
}