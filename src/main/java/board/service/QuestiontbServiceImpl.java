package board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.dao.QuestiontbDao;
import board.domain.QuestiontbVO;
import board.pagination.Pagination;
import board.pagination.Search;

@Service
public class QuestiontbServiceImpl implements QuestiontbService {

	private QuestiontbDao questiontbDao;
	
	public QuestiontbDao getQuestiontbDao() {
		return questiontbDao;
	}

	public void setQuestiontbDao(QuestiontbDao questiontbDao) {
		this.questiontbDao = questiontbDao;
	}
	
	@Override
	public List<QuestiontbVO> list(Search search) {
		return questiontbDao.list(search);
		
	}

	@Override
	public int delete(QuestiontbVO QuestiontbVO) {
		return questiontbDao.delete(QuestiontbVO);
		
	}

	@Override
	public int edit(QuestiontbVO QuestiontbVO) {
		return questiontbDao.update(QuestiontbVO);
	}

	@Override
	public void write(QuestiontbVO QuestiontbVO) {
		questiontbDao.insert(QuestiontbVO);
	}

	@Override
	public QuestiontbVO read(int queNo) {
		questiontbDao.updateReadCount(queNo);
		return questiontbDao.select(queNo);
	}

	@Override
	public int getListCnt(Search search) {
		// TODO Auto-generated method stub
		return questiontbDao.getListCnt(search);
	}

	

}