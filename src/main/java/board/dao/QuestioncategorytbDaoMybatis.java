package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.QuestioncategorytbVO;
@Repository
public class QuestioncategorytbDaoMybatis implements QuestioncategorytbDao {

	private SqlSessionTemplate sqlSessionTemplate;
	
	 public QuestioncategorytbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
    	 this.sqlSessionTemplate = sqlSessionTemplate;
    }
    
    public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
            this.sqlSessionTemplate = sqlSessionTemplate;
    }
	@Override
	public List<QuestioncategorytbVO> list() {
		return sqlSessionTemplate.selectList("questioncategorytbDAO.list");
	}

	@Override
	public int delete(QuestioncategorytbVO questioncategorytbVO) {
		return sqlSessionTemplate.delete("questioncategorytbDAO.delete", questioncategorytbVO);
	}

	@Override
	public int deleteAll() {
		return sqlSessionTemplate.delete("questioncategorytbDAO.deleteAll");
	}

	@Override
	public int update(QuestioncategorytbVO questioncategorytbVO) {
		return sqlSessionTemplate.update("questioncategorytbDAO.update", questioncategorytbVO);
	}

	@Override
	public void insert(QuestioncategorytbVO questioncategorytbVO) {
		sqlSessionTemplate.insert("questioncategorytbDAO.insert", questioncategorytbVO);
		
	}

	@Override
	public QuestioncategorytbVO select(int quecateNum) {
		QuestioncategorytbVO vo = (QuestioncategorytbVO) sqlSessionTemplate.selectOne("questioncategorytbDAO.select", quecateNum);
		return vo;
	}

}
