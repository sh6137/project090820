package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dao.NoticeBoardDao;
import board.dto.NoticeBoardDto;

@Service //service bean
public class NoticeBoardServiceImpl implements NoticeBoardService {

	
	@Autowired
	NoticeBoardDao noticeboardDao;
	
	@Override
	public void insert(NoticeBoardDto dto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public NoticeBoardDto read(int notice_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(NoticeBoardDto dto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int notice_no) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<NoticeBoardDto> listAll(int start, int end, String search_option, String keyword) throws Exception {
		return noticeboardDao.listAll(start, end, search_option, keyword);
	}

	@Override
	public void increasenotice_read_cnt(int notice_no) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public int countArticle(String search_opiton, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
