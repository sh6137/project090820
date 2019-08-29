package board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.dao.QuestioncategorytbDao;
import board.domain.QuestioncategorytbVO;
import board.domain.QuestiontbVO;

@Service
public class QuestioncategorytbServiceImpl implements QuestioncategorytbService {

	private QuestioncategorytbDao questioncategorytbDao;
	
	
	public QuestioncategorytbDao getQuestioncategorytbDao() {
		return questioncategorytbDao;
	}

	public void setQuestioncategorytbDao(QuestioncategorytbDao questioncategorytbDao) {
		this.questioncategorytbDao = questioncategorytbDao;
	}

	@Override
	public List<QuestioncategorytbVO> list() {
		return questioncategorytbDao.list();
		
	}

	@Override
	public int delete(QuestioncategorytbVO QuestioncategorytbVO) {
		return questioncategorytbDao.delete(QuestioncategorytbVO);
		
	}

	@Override
	public int edit(QuestioncategorytbVO QuestioncategorytbVO) {
		return questioncategorytbDao.update(QuestioncategorytbVO);
	}

	@Override
	public void write(QuestioncategorytbVO QuestioncategorytbVO) {
		questioncategorytbDao.insert(QuestioncategorytbVO);
	}

	@Override
	public QuestioncategorytbVO read(int quecateNum) {
		
		return questioncategorytbDao.select(quecateNum);
	}

	

}
