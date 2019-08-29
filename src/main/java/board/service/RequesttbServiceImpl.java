package board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.dao.RequesttbDao;
import board.domain.RequesttbVO;

@Service
public class RequesttbServiceImpl implements RequesttbService {

	private RequesttbDao requesttbDao;
	
	
	public RequesttbDao getRequesttbDao() {
		return requesttbDao;
	}

	public void setRequesttbDao(RequesttbDao requesttbDao) {
		this.requesttbDao = requesttbDao;
	}

	@Override
	public List<RequesttbVO> list() {
		return requesttbDao.list();
		
	}

	@Override
	public int delete(RequesttbVO requesttbVO) {
		return requesttbDao.delete(requesttbVO);
		
	}

	@Override
	public int edit(RequesttbVO requesttbVO) {
		return requesttbDao.update(requesttbVO);
	}

	@Override
	public void write(RequesttbVO requesttbVO) {
		requesttbDao.insert(requesttbVO);
	}

	@Override
	public RequesttbVO read(int reqNo) {
		requesttbDao.updateReadCount(reqNo);
		return requesttbDao.select(reqNo);
	}

	

}
