package board.service;

import java.util.List;

import board.dao.CategorytbDao;
import board.domain.CategorytbVO;

public class CategorytbServiceImpl implements CategorytbService {
	
	
	private CategorytbDao categorytbDao;
	

	public CategorytbDao getCategorytbDao() {
		return categorytbDao;
	}

	public void setCategorytbDao(CategorytbDao categorytbDao) {
		this.categorytbDao = categorytbDao;
	}

	@Override
	public List<CategorytbVO> list() {
		return categorytbDao.list();
		
	}

	@Override
	public int delete(CategorytbVO CategorytbVO) {
		return categorytbDao.delete(CategorytbVO);
		
	}

	@Override
	public int edit(CategorytbVO CategorytbVO) {
		return categorytbDao.update(CategorytbVO);
	}

	@Override
	public void write(CategorytbVO CategorytbVO) {
		categorytbDao.insert(CategorytbVO);
	}

	@Override
	public CategorytbVO read(int cateNo) {
		
		return categorytbDao.select(cateNo);
	}

}
