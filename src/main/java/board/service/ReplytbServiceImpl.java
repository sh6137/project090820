package board.service;

import java.util.List;

import board.dao.ReplytbDao;
import board.domain.ReplytbVO;
import board.pagination.Pagination;

public class ReplytbServiceImpl implements ReplytbService {

	private ReplytbDao replytbDao;
	
	
	public ReplytbDao getReplytbDao() {
		return replytbDao;
	}

	public void setReplytbDao(ReplytbDao replytbDao) {
		this.replytbDao = replytbDao;
	}

	@Override
	public List<ReplytbVO> list(Pagination pagination) {
		// TODO Auto-generated method stub
		return replytbDao.list(pagination);
	}

	@Override
	public int delete(int reNo) {
		// TODO Auto-generated method stub
		return replytbDao.delete(reNo);
	}

	@Override
	public int getListCnt() {
		// TODO Auto-generated method stub
		return replytbDao.getListCnt();
	}

}
