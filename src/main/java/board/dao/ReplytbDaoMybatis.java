package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.ReplytbVO;
import board.pagination.Pagination;

@Repository
public class ReplytbDaoMybatis implements ReplytbDao {

	 private SqlSessionTemplate sqlSessionTemplate;

     public ReplytbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
     	 this.sqlSessionTemplate = sqlSessionTemplate;
     }
     
     public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
             this.sqlSessionTemplate = sqlSessionTemplate;
     }
	@Override
	public List<ReplytbVO> list(Pagination pagination) {
		return sqlSessionTemplate.selectList("replytbDAO.list", pagination);
	}

	@Override
	public int delete(int reNo) {
		return sqlSessionTemplate.delete("replytbDAO.delete", reNo);
	}

	@Override
	public int deleteAll() {
		return sqlSessionTemplate.delete("replytbDAO.deleteAll");
	}

	@Override
	public ReplytbVO select(int reNo) {
		ReplytbVO vo = (ReplytbVO) sqlSessionTemplate.selectOne("replytbDAO.select", reNo);
		return vo;
	}

	@Override
	public int getListCnt() {
		return sqlSessionTemplate.selectOne("replytbDAO.getListCnt");
	}

}
