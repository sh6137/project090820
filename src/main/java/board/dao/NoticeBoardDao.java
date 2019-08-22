package board.dao;

import java.util.List;

import board.dto.NoticeBoardDto;

public interface NoticeBoardDao {
	public void insert (NoticeBoardDto dto)throws Exception; //글쓰기
	
	public NoticeBoardDto read(int notice_no) throws Exception;	//글읽기
	
	public void update(NoticeBoardDto dto) throws Exception; // 글수정
	
	public void delete(int notice_no) throws Exception; //글삭제
	
	//목록(페이지 나누기, 검색 기능 포함)
	public List<NoticeBoardDto> listAll(int start, int end,
			String search_option, String keyword) throws Exception;
	//조회수 증가 처리
	public void increasenotice_read_cnt(int notice_no) throws Exception;
	//레코드 객수 계산
	public int countArticle(String search_opiton, String keyword)
		throws Exception;
	
}
