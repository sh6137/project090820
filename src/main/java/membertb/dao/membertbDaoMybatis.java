package membertb.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import membertb.domain.membertbVO;

@Repository
public class membertbDaoMybatis implements membertbDao {

        private SqlSessionTemplate sqlSessionTemplate;

        public membertbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
        	 this.sqlSessionTemplate = sqlSessionTemplate;
        }
        
        public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
                this.sqlSessionTemplate = sqlSessionTemplate;
        }
        
        //메서드 재정의 하고 sqlsession선언! sqlsession의 자체 객체가 있으면 그거 써서 sql-쿼리문에다가 맵핑 
        
        @Override
        public int delete(membertbVO membertbVO) {
                return sqlSessionTemplate.delete("membertbDAO.delete", membertbVO);
        }
        @Override
        public void insert(membertbVO membertbVO) {
                sqlSessionTemplate.insert("membertbDAO.insert", membertbVO);
        }
       
        @Override
        public String loginCheck(membertbVO membertbVO) {
        	return sqlSessionTemplate.selectOne("membertbDAO.logincheck", membertbVO);
        }

		@Override
		public int update(membertbVO membertbVO) {
			return sqlSessionTemplate.update("membertbDAO.update", membertbVO);
		}
        
        @Override
        public membertbVO idCheck(String memberid) {
        	return sqlSessionTemplate.selectOne("membertbDAO.idcheck", memberid);
        }
        
        @Override
        public membertbVO nickCheck(String membernick) {
        	return sqlSessionTemplate.selectOne("membertbDAO.nickcheck", membernick);
        }
}