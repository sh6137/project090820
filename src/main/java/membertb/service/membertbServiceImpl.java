package membertb.service;

import org.springframework.stereotype.Service;
import membertb.dao.membertbDao;
import membertb.domain.membertbVO;

@Service
public class membertbServiceImpl implements membertbService {
	private membertbDao membertbDao;

	public membertbDao getmembertbDao() {
		return membertbDao;
	}

	public void setmembertbDao(membertbDao membertbDao) {
		this.membertbDao = membertbDao;
	}
   
	//추상메서드 선언하고 반환도 같이 할것!
	
    @Override
	public int delete(membertbVO membertbVO) {
		return membertbDao.delete(membertbVO); //0이면 그대로 1이면 삭제
	}
    
    @Override
	public void insert(membertbVO membertbVO) {
    	membertbDao.insert(membertbVO);
	}
    
    @Override
    public String loginCheck(membertbVO membertbVO) {
    	return membertbDao.loginCheck(membertbVO);
    }

	@Override
	public int update(membertbVO membertbVO) {
		return membertbDao.update(membertbVO);
	}
    
	@Override
	public membertbVO idCheck(String memberid) {
		return membertbDao.idCheck(memberid);
	}
	
	@Override
	public membertbVO nickCheck(String membernick) {
		return membertbDao.nickCheck(membernick);
	}
  
}