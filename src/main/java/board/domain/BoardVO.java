package board.domain;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;
//import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.NotEmpty;

@Alias("BoardVO")
public class BoardVO {
        
	/*
	 * @Length(min=2, max=5, message="제목은 2자 이상, 5자 미만 입력해야 합니다.") 
	 * private String title;
	 * 
	 * @NotEmpty(message="내용을 입력하세요.") 
	 * private String content;
	 * 
	 * @NotEmpty(message="작성자를 입력하세요.") 
	 * private String writer;
	 */
	
	private int memberno; 			 //1.회원번호
	private String memberid;		 //2.아이디
	private String memberpass;		 //3.비밀번호
	private String membernick;		 //4.닉네임
	private String memberemail;	 //5.이메일
	private String membergender;	 //6.성별
	private int memberbirth;		 //7.생년월일
	private Timestamp memberregdt; //8.가입일
	private int memberadmin;		 //9.운영자여부(기본 0)
	private String memberlike;		 //10.좋아요한 제품
	
	
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
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
	public String getMembernick() {
		return membernick;
	}
	public void setMembernick(String membernick) {
		this.membernick = membernick;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMembergender() {
		return membergender;
	}
	public void setMembergender(String membergender) {
		this.membergender = membergender;
	}
	public int getMemberbirth() {
		return memberbirth;
	}
	public void setMemberbirth(int memberbirth) {
		this.memberbirth = memberbirth;
	}
	public Timestamp getMemberregdt() {
		return memberregdt;
	}
	public void setMemberregdt(Timestamp memberregdt) {
		this.memberregdt = memberregdt;
	}
	public int getMemberadmin() {
		return memberadmin;
	}
	public void setMemberadmin(int memberadmin) {
		this.memberadmin = memberadmin;
	}
	public String getMemberlike() {
		return memberlike;
	}
	public void setMemberlike(String memberlike) {
		this.memberlike = memberlike;
	}
	
        
}