package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.ProductVO;

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
		public ProductVO selectName(String proName) {
			// TODO Auto-generated method stub
			ProductVO vo = (ProductVO)sqlSessionTemplate.selectOne("upName", proName);
			return vo;
		}

		@Override
		public ProductVO selectThumbnail(String proThumbnail) {
			// TODO Auto-generated method stub
			ProductVO vo = (ProductVO)sqlSessionTemplate.selectOne("selectThumbnail", proThumbnail);
			return vo;
		}

		@Override
		public List<ProductVO> list() {
			// TODO Auto-generated method stub
			return sqlSessionTemplate.selectList("list");
		}
		
		@Override
		public List<ProductVO> list2() {
			// TODO Auto-generated method stub
			return sqlSessionTemplate.selectList("list2");
		}
		
}
