package spring;

public class AuthInfo {
	private String memberid;

	private String memberpass;
	
	public String getMemberid() {
		return memberid;
	}
	
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	
	public String getMemberpass() {
		return memberpass;
	}
	
	public void setMemberpass(String memberpass) {
		this.memberpass = memberpass;
	}
	public AuthInfo(String memberid, String memberpass) {
		this.memberid = memberid;
		this.memberpass = memberpass;
	}
	
	
	
}
