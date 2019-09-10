package membertb.service;

import membertb.domain.membertbVO;



public interface membertbService {

	
 //추상메서드 선언!
	
	public abstract int delete(membertbVO membertbVO); //0이면 그대로! //1이면 삭제

	public abstract void insert(membertbVO membertbVO);

	public abstract String loginCheck(membertbVO membertbVO);
	
	public abstract int update(membertbVO membertbVO);
	
	public abstract membertbVO idCheck(String memberid);
	
	public abstract membertbVO nickCheck(String membernick);
}