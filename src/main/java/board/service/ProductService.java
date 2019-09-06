package board.service;

import org.springframework.stereotype.Service;

import board.domain.ProductVO;
import product.dao.ProductDao;

@Service
public class ProductService {
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public ProductVO select(String proNo) {
		return productDao.select(proNo);
	}
	
	public void readUp(String proNo) {
		productDao.readUp(proNo);
	}
}
