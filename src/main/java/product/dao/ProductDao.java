package product.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.ProductVO;

@Repository
public class ProductDao {
	
	 private SqlSessionTemplate sqlSessionTemplate;

     public ProductDao(SqlSessionTemplate sqlSessionTemplate){
     	 this.sqlSessionTemplate = sqlSessionTemplate;
     }
     
	 public void insert(ProductVO ProductVO) {
         sqlSessionTemplate.insert("insert", ProductVO);
	 }
	 
	 public ProductVO select(String proNo) {
		 return sqlSessionTemplate.selectOne("select", proNo);
	 }
}
