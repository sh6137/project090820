package board.service;

import java.util.List;

import board.domain.BoardVO;

public interface BoardService {

	public abstract int delete(BoardVO boardVO);

	public abstract void insert(BoardVO boardVO);

	
}
