package board.dto;

import java.util.Date;

public class NoticeBoardDto {
	private int notice_no;
	private String notice_title;
	private String notice_text;
	private String notice_user;
	private Date notice_reg_dt;
	private int notice_read_cnt;
	
	public int getNotice_no() {
		return notice_no;
	}
	public void setNotice_no(int notice_no) {
		this.notice_no = notice_no;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_text() {
		return notice_text;
	}
	public void setNotice_text(String notice_text) {
		this.notice_text = notice_text;
	}
	public String getNotice_user() {
		return notice_user;
	}
	public void setNotice_user(String notice_user) {
		this.notice_user = notice_user;
	}
	public Date getNotice_reg_dt() {
		return notice_reg_dt;
	}
	public void setNotice_reg_dt(Date notice_reg_dt) {
		this.notice_reg_dt = notice_reg_dt;
	}
	public int getNotice_read_cnt() {
		return notice_read_cnt;
	}
	public void setNotice_read_cnt(int notice_read_cnt) {
		this.notice_read_cnt = notice_read_cnt;
	}
	@Override
	public String toString() {
		return "NoticeBoardDto [notice_no=" + notice_no + ", notice_title=" + notice_title + ", notice_text="
				+ notice_text + ", notice_user=" + notice_user + ", notice_reg_dt=" + notice_reg_dt
				+ ", notice_read_cnt=" + notice_read_cnt + "]";
	}
	
	
}
