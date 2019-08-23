package board.service;

import org.springframework.stereotype.Service;

import board.dao.BoardDao;
import board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	private BoardDao boardDao;

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
   
    @Override
	public int delete(BoardVO boardVO) {
		return boardDao.delete(boardVO);
	}
  
    @Override
	public void insert1(BoardVO boardVO) {
		boardDao.insert(boardVO);
	}
}