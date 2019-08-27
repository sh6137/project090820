package board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.domain.ReplyVO;
import product.dao.ProductReplyDao;

@Service
public class ProductReplyService {
	private ProductReplyDao productReplyDao;

	public ProductReplyDao getProductReplyDao() {
		return productReplyDao;
	}

	public void setProductReplyDao(ProductReplyDao productReplyDao) {
		this.productReplyDao = productReplyDao;
	}
	
	public List<ReplyVO> list() {
		return productReplyDao.list();
	}
}
