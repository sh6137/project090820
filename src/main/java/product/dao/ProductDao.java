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
         sqlSessionTemplate.insert("productDAO.insert", ProductVO);
	 }
	 
	 public ProductVO select(String proNo) {
		 return sqlSessionTemplate.selectOne("productDAO.select", Integer.parseInt(proNo));
	 }
	 
	 public void readUp(String proNo) {
		 sqlSessionTemplate.update("productDAO.readUp", Integer.parseInt(proNo));
	 }
}
