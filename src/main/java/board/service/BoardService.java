package board.service;

import board.domain.BoardVO;

public interface BoardService {

	public abstract int delete(BoardVO boardVO);

	public abstract void insert(BoardVO boardVO);

	public abstract String loginCheck(BoardVO boardVO);
}