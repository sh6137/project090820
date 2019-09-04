package board.service;

import board.domain.BoardVO;



public interface BoardService {

	
 //추상메서드 선언!
	
	public abstract int delete(BoardVO boardVO); //0이면 그대로! //1이면 삭제

	public abstract void insert(BoardVO boardVO);

	public abstract String loginCheck(BoardVO boardVO);
	
	public abstract int update(BoardVO boardVO);
	
	public abstract BoardVO idCheck(String memberid);
	
	public abstract BoardVO nickCheck(String membernick);
}