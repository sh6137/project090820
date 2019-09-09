package board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.dao.NoticetbDao;
import board.domain.NoticetbVO;
import board.pagination.Pagination;

@Service
public class NoticetbServiceImpl implements NoticetbService {

	private NoticetbDao noticetbDao;
	
	public NoticetbDao getNoticetbDao() {
		return noticetbDao;
	}

	public void setNoticetbDao(NoticetbDao noticetbDao) {
		this.noticetbDao = noticetbDao;
	}
	
	@Override
	public List<NoticetbVO> list(Pagination pagination) {
		return noticetbDao.list(pagination);
		
	}

	@Override
	public int delete(NoticetbVO NoticetbVO) {
		return noticetbDao.delete(NoticetbVO);
		
	}

	@Override
	public int edit(NoticetbVO NoticetbVO) {
		return noticetbDao.update(NoticetbVO);
	}

	@Override
	public void write(NoticetbVO NoticetbVO) {
		noticetbDao.insert(NoticetbVO);
	}

	@Override
	public NoticetbVO read(int noticeNo) {
		noticetbDao.updateReadCount(noticeNo);
		return noticetbDao.select(noticeNo);
	}

	@Override
	public int getListCnt() {
		// TODO Auto-generated method stub
		return noticetbDao.getListCnt();
	}

	

}
