package board.service;

import java.util.HashMap;
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
	
	public List<ReplyVO> list(String location, String postNo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("location", location);
		map.put("postNo", postNo);
		return productReplyDao.list(map);
	}
	
	public int insert(String location, String postNo, String reText, String member, String memberNo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("location", location);
		map.put("postNo", postNo);
		map.put("reText", reText);
		map.put("member", member);
		map.put("memberNo", memberNo);
		return productReplyDao.insert(map);
	}
}
