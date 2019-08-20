package board.service;

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
    public Object call(ProductVO productVO) {
    	return boardDao.call(productVO);
    }
}
