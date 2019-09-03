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
		return boardDao.delete(boardVO); //0이면 그대로 1이면 삭제
	}
    
    @Override
	public void insert(BoardVO boardVO) {
		boardDao.insert(boardVO);
	}
    
    @Override
    public String loginCheck(BoardVO boardVO) {
    	return boardDao.loginCheck(boardVO);
    }

	@Override
	public int update(BoardVO boardVO) {
		return boardDao.update(boardVO);
	}
    
	@Override
	public BoardVO idCheck(String memberid) {
		return boardDao.idCheck(memberid);
	}
	
	@Override
	public BoardVO nickCheck(String membernick) {
		return boardDao.nickCheck(membernick);
	}
  
}