package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.RequesttbVO;;

@Repository
public class RequesttbDaoMybatis implements RequesttbDao {

        private SqlSessionTemplate sqlSessionTemplate;

        public RequesttbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
        	 this.sqlSessionTemplate = sqlSessionTemplate;
        }
        
        public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
                this.sqlSessionTemplate = sqlSessionTemplate;
        }

        @Override
        public List<RequesttbVO> list() {
                return sqlSessionTemplate.selectList("requesttbDAO.list");
        }
        @Override
        public int delete(RequesttbVO RequesttbVO) {
                return sqlSessionTemplate.delete("requesttbDAO.delete", RequesttbVO);
        }
        @Override
        public int deleteAll() {
                return sqlSessionTemplate.delete("requesttbDAO.deleteAll");
        }
        @Override
        public int update(RequesttbVO RequesttbVO) {
                return sqlSessionTemplate.update("requesttbDAO.update", RequesttbVO);
        }
        @Override
        public void insert(RequesttbVO RequesttbVO) {
                sqlSessionTemplate.insert("requesttbDAO.insert", RequesttbVO);
        }
        @Override
        public RequesttbVO select(int reqNo) {
        	RequesttbVO vo = (RequesttbVO) sqlSessionTemplate.selectOne("requesttbDAO.select", reqNo);
                return vo;
        }
        @Override
        public int updateReadCount(int reqNo) {
                return sqlSessionTemplate.update("requesttbDAO.updateCount", reqNo);
        }

}
