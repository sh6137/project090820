package board.domain;


import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Alias("NoticetbVO")
public class NoticetbVO {
	private int noticeNo;
	
	@Length(min=2, max=15, message="제목은 2자이상, 15자 미만 입력해야 합니다.")
	private String noticeTitle;
	
	@NotEmpty(message="작성자를 입력하세요")
	private String noticeUser;
	
	@NotEmpty(message="내용을 입력하세요")
	private String noticeText;
	private int noticeReadCnt;
	
	
	private Timestamp noticeRegDt;
	
	public NoticetbVO() {}
	
	public NoticetbVO(String noticeTitle, String noticeUser, String noticeText) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeUser = noticeUser;
		this.noticeText = noticeText;
		this.noticeReadCnt=0;
		
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeUser() {
		return noticeUser;
	}

	public void setNoticeUser(String noticeUser) {
		this.noticeUser = noticeUser;
	}

	public String getNoticeText() {
		return noticeText;
	}

	public void setNoticeText(String noticeText) {
		this.noticeText = noticeText;
	}

	public int getNoticeReadCnt() {
		return noticeReadCnt;
	}

	public void setNoticeReadCnt(int noticeReadCnt) {
		this.noticeReadCnt = noticeReadCnt;
	}

	public Timestamp getNoticeRegDt() {
		return noticeRegDt;
	}

	public void setNoticeRegDt(Timestamp noticeRegDt) {
		this.noticeRegDt = noticeRegDt;
	}
		
}
