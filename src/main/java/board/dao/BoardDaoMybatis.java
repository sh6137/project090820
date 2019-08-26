package board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.BoardVO;

@Repository
public class BoardDaoMybatis implements BoardDao {

        private SqlSessionTemplate sqlSessionTemplate;

        public BoardDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
        	 this.sqlSessionTemplate = sqlSessionTemplate;
        }
        
        public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
                this.sqlSessionTemplate = sqlSessionTemplate;
        }

        @Override
        public int delete(BoardVO boardVO) {
                return sqlSessionTemplate.delete("delete", boardVO);
        }
        @Override
        public void insert(BoardVO boardVO) {
                sqlSessionTemplate.insert("insert", boardVO);
        }
       
//        @Override
//        public int loginCheck(BoardVO boardVO) {
//               return sqlSessionTemplate.selectOne("loginCheck", boardVO);
//        }
}