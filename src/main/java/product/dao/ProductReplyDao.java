package product.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.ReplyVO;

@Repository
public class ProductReplyDao {
	 private SqlSessionTemplate sqlSessionTemplate;

     public ProductReplyDao(SqlSessionTemplate sqlSessionTemplate){
     	 this.sqlSessionTemplate = sqlSessionTemplate;
     }
     
	 public List<ReplyVO> list() {
         return sqlSessionTemplate.selectList("productReplyDao.list");
	 }
}
