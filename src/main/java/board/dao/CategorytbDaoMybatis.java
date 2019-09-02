package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import board.domain.CategorytbVO;

public class CategorytbDaoMybatis implements CategorytbDao {

	private SqlSessionTemplate sqlSessionTemplate;
	
	 public CategorytbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
   	 this.sqlSessionTemplate = sqlSessionTemplate;
   }
   
   public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
           this.sqlSessionTemplate = sqlSessionTemplate;
   }
	@Override
	public List<CategorytbVO> list() {
		return sqlSessionTemplate.selectList("categorytbDAO.list");
	}

	@Override
	public int delete(CategorytbVO categorytbVO) {
		return sqlSessionTemplate.delete("categorytbDAO.delete", categorytbVO);
	}

	@Override
	public int deleteAll() {
		return sqlSessionTemplate.delete("categorytbDAO.deleteAll");
	}

	@Override
	public int update(CategorytbVO categorytbVO) {
		return sqlSessionTemplate.update("categorytbDAO.update", categorytbVO);
	}

	@Override
	public void insert(CategorytbVO categorytbVO) {
		sqlSessionTemplate.insert("categorytbDAO.insert", categorytbVO);
		
	}

	@Override
	public CategorytbVO select(int cateNo) {
		CategorytbVO vo = (CategorytbVO) sqlSessionTemplate.selectOne("categorytbDAO.select", cateNo);
		return vo;
	}

}
