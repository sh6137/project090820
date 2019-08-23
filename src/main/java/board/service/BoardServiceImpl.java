package board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.dao.BoardDao;
import board.domain.ProductVO;

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
	public List<ProductVO> list() {
		// TODO Auto-generated method stub
		return boardDao.list();
	}
	
	@Override
	public List<ProductVO> list2() {
		// TODO Auto-generated method stub
		return boardDao.list2();
	}
}
