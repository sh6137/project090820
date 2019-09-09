package board.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("ReplytbVO")
public class ReplytbVO {
	private int reNo;
	private String reLocation;
	private int rePostNo;
	private int reUserNo;
	private String reUser;
	private String reText;
	private Date reRegDt;
	
	public int getReNo() {
		return reNo;
	}
	public void setReNo(int reNo) {
		this.reNo = reNo;
	}
	public String getReLocation() {
		return reLocation;
	}
	public void setReLocation(String reLocation) {
		this.reLocation = reLocation;
	}
	public int getRePostNo() {
		return rePostNo;
	}
	public void setRePostNo(int rePostNo) {
		this.rePostNo = rePostNo;
	}
	public int getReUserNo() {
		return reUserNo;
	}
	public void setReUserNo(int reUserNo) {
		this.reUserNo = reUserNo;
	}
	public String getReUser() {
		return reUser;
	}
	public void setReUser(String reUser) {
		this.reUser = reUser;
	}
	public String getReText() {
		return reText;
	}
	public void setReText(String reText) {
		this.reText = reText;
	}
	public Date getReRegDt() {
		return reRegDt;
	}
	public void setReRegDt(Date reRegDt) {
		this.reRegDt = reRegDt;
	}
}