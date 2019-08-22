package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.NoticeBoardDto;

@Repository //dao bean으로 등록
public class NoticeBoardDaoImpl implements NoticeBoardDao {

	
	@Autowired //의존관계 주입
	SqlSession sqlSession;
	
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
		// TODO Auto-generated method stub
		return sqlSession.selectList("Noticeboard.listAll");
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
