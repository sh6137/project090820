package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;

import board.dao.BoardDao;
import board.domain.ProductVO;
import board.pagination.Pagination;

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

	@Override
	public void write(ProductVO productVO) {
		boardDao.insert(productVO);
	}

	
	@Override
	public List<ProductVO> list3(Pagination pagination) {
		//System.out.println("pag:" + pagination.getStartList());
		//System.out.println("pag:" + pagination.getCount());
		System.out.println(boardDao.list3(pagination).toString());
		return boardDao.list3(pagination);
		
	}

	@Override
	public int getListCnt() {
		// TODO Auto-generated method stub
		return boardDao.getListCnt();
	}

}
