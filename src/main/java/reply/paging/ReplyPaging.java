package reply.paging;

import java.util.ArrayList;
import java.util.List;

import board.domain.ReplyVO;

public class ReplyPaging {
	private List<ReplyVO> voList;
	private List<Integer> pageList;
	
	public void init(List<ReplyVO> voList){ //DB에서 받아온 댓글 리스트에 번호 재 부여, 페이지 수 결정
		this.voList = voList;
		pageList = new ArrayList<Integer>();
		int size = this.voList.size();
		for(int i = 0; i < size; i++) {
			ReplyVO tmp = this.voList.get(i);
			tmp.setReNo(i + 1);
		}
		for(int i = 0; i <= voList.size() / 10; i++) {
			pageList.add(i, i+1);
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
		for(int i = (pageNum - 1) * 10; i < pageNum * 10 && i < this.voList.size(); i++) {
			voList.add(this.voList.get(i));
		}
		return voList;
	}
}
