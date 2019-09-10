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
	private int reqUserno=1234;;
	
	public RequesttbVO() {}

	public RequesttbVO(String reqTitle, String reqUser, String reqText, int reqUserno) {
		super();
		this.reqTitle = reqTitle;
		this.reqUser = reqUser;
		this.reqText = reqText;
		this.reqReadCnt = 0;
		this.reqUserno = reqUserno;
		
		
		
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
	
	public int getReqUserno() {
		return reqUserno;
	}

	public void setReqUserno(int reqUserno) {
		this.reqUserno = reqUserno;
	}

	
	
}
