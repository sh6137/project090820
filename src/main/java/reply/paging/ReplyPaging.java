package reply.paging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import board.domain.ReplyVO;

public class ReplyPaging {
	private List<ReplyVO> voList;
	private List<Integer> pageList;
	int pageSize = 10;
	
	public void init(List<ReplyVO> voList){ //DB에서 받아온 댓글 리스트에 번호 재 부여, 페이지 수 결정
		this.voList = voList;
		pageList = new ArrayList<Integer>();
		int listSize = this.voList.size();
		for(int i = 0; i < listSize; i++) {
			ReplyVO tmp = this.voList.get(i);
			tmp.setReNo(i + 1);
		}
		Collections.reverse(this.voList);
		for(int i = 0; i <= listSize / pageSize; i++) {
			pageList.add(i, i+1);
		}
		if(voList.size() % pageSize == 0) {		//댓글 수가 페이지 크기로 나누어 떨어지면 마지막 페이지 삭제
			pageList.remove(pageList.size() - 1);
		}
	}
	
	public List<Integer> getPageList(){
		return pageList;
	}
	
	public List<ReplyVO> getVoList() {
		return voList;
	}
	
	public List<ReplyVO> paging(int pageNum){	//페이징 처리
		List<ReplyVO> voList = new ArrayList<ReplyVO>();
		for(int i = (pageNum - 1) * pageSize; i < pageNum * pageSize && i < this.voList.size(); i++) {
			voList.add(this.voList.get(i));
		}
		return voList;
	}
}
