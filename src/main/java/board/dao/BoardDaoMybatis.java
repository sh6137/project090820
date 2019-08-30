package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.ProductVO;
import board.pagination.Pagination;

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
		public List<ProductVO> list() {
			// TODO Auto-generated method stub
			//selectList, insert등은 sqlSessionTemplate의 내장메서드
			return sqlSessionTemplate.selectList("boardDAO.list");
		}
		
		@Override
		public List<ProductVO> list2() {
			// TODO Auto-generated method stub
			return sqlSessionTemplate.selectList("boardDAO.list2");
		}

		@Override
		public void insert(ProductVO productVO) {
			sqlSessionTemplate.insert("boardDAO.insert", productVO);
		}

		@Override
		public List<ProductVO> list3(Pagination pagination) {
			// TODO Auto-generated method stub
			return sqlSessionTemplate.selectList("boardDAO.list3", pagination);
		}

		@Override
		public int getListCnt() {
			return sqlSessionTemplate.selectOne("boardDAO.getListCnt");
		}

}
