package membertb.dao;

import membertb.domain.membertbVO;

//메서드 선언!
public interface membertbDao {

	public abstract int delete(membertbVO membertbVO);
	
	public abstract void insert(membertbVO membertbVO);
	
	public abstract String loginCheck(membertbVO membertbVO);
	
	public abstract int update(membertbVO membertbVO);
	
	public abstract membertbVO idCheck(String memberid);
	
	public abstract membertbVO nickCheck(String membernick);
}