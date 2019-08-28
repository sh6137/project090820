package spring;

import java.util.Date;

public class Member{
	private String memberid;
	private String memberpass;
	
	public Member(String memberid, String memberpass){
		this.memberid = memberid;
		this.memberpass = memberpass;
	}
	
	
	public boolean matchPassword(String memberpass) {
		return this.memberpass.equals(memberpass);
	}
	
	//암호변경 기능을 구현하는 메서드
	public void changePassword(String oldPassword, String newPassword){
		if(!memberpass.equals(oldPassword))
			throw new IdPasswordMatchingException();
		this.memberpass = newPassword;
	}
}