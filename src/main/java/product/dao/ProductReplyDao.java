package product.dao;

import java.util.HashMap;
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
     
	 public List<ReplyVO> list(HashMap<String, Object> map) {
         return sqlSessionTemplate.selectList("productReplyDao.list", map);
	 }
	 
	 public int insert(HashMap<String, Object> map) {
         return sqlSessionTemplate.insert("productReplyDao.insert", map);
	 }
}
