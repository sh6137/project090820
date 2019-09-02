package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.QuestiontbVO;
import board.pagination.Pagination;
import board.pagination.Search;;

@Repository
public class QuestiontbDaoMybatis implements QuestiontbDao {

        private SqlSessionTemplate sqlSessionTemplate;

        public QuestiontbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
        	 this.sqlSessionTemplate = sqlSessionTemplate;
        }
        
        public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
                this.sqlSessionTemplate = sqlSessionTemplate;
        }

        @Override
        public List<QuestiontbVO> list(Search search) {
                return sqlSessionTemplate.selectList("questiontbDAO.list", search);
        }
        @Override
        public int delete(QuestiontbVO QuestiontbVO) {
                return sqlSessionTemplate.delete("questiontbDAO.delete", QuestiontbVO);
        }
        @Override
        public int deleteAll() {
                return sqlSessionTemplate.delete("questiontbDAO.deleteAll");
        }
        @Override
        public int update(QuestiontbVO QuestiontbVO) {
                return sqlSessionTemplate.update("questiontbDAO.update", QuestiontbVO);
        }
        @Override
        public void insert(QuestiontbVO QuestiontbVO) {
                sqlSessionTemplate.insert("questiontbDAO.insert", QuestiontbVO);
        }
        @Override
        public QuestiontbVO select(int queNo) {
        	QuestiontbVO vo = (QuestiontbVO) sqlSessionTemplate.selectOne("questiontbDAO.select", queNo);
                return vo;
        }
        @Override
        public int updateReadCount(int queNo) {
                return sqlSessionTemplate.update("questiontbDAO.updateCount", queNo);
        }

		@Override
		public int getListCnt(Search search) {
			
			return sqlSessionTemplate.selectOne("questiontbDAO.getListCnt");
		}

}
