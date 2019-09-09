package board.domain;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

@Alias("RequesttbVO")
public class RequesttbVO {
	private int reqNo;
	private String reqTitle;
	private String reqUser;
	private String reqText;
	private int reqReadCnt;
	private Timestamp reqRegDt;
	private int reqPassword;
	
	public RequesttbVO() {}

	public RequesttbVO(String reqTitle, String reqUser, String reqText, int reqPassword) {
		super();
		this.reqTitle = reqTitle;
		this.reqUser = reqUser;
		this.reqText = reqText;
		this.reqReadCnt = 0;
		this.reqPassword = reqPassword;
		
		
		
	}
	public int getReqNo() {
		return reqNo;
	}
	public void setReqNo(int reqNo) {
		this.reqNo = reqNo;
	}
	public String getReqTitle() {
		return reqTitle;
	}
	public void setReqTitle(String reqTitle) {
		this.reqTitle = reqTitle;
	}
	public String getReqUser() {
		return reqUser;
	}
	public void setReqUser(String reqUser) {
		this.reqUser = reqUser;
	}
	public String getReqText() {
		return reqText;
	}
	public void setReqText(String reqText) {
		this.reqText = reqText;
	}
	public int getReqReadCnt() {
		return reqReadCnt;
	}
	public void setReqReadCnt(int reqReadCnt) {
		this.reqReadCnt = reqReadCnt;
	}
	public Timestamp getReqRegDt() {
		return reqRegDt;
	}
	public void setReqRegDt(Timestamp reqRegDt) {
		this.reqRegDt = reqRegDt;
	}
	public int getReqPassword() {
		return reqPassword;
	}
	public void setReqPassword(int reqPassword) {
		this.reqPassword = reqPassword;
	}
	
	
}
