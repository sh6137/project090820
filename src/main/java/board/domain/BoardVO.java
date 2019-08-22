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
	
	private int member_no; 			 //1.회원번호
	
	@NotEmpty(message="아이디를 입력하세요.")
	private String member_id;		 //2.아이디
	
	@NotEmpty(message="패스워드를 입력하세요.")
	private String member_pass;		 //3.비밀번호
	
	@NotEmpty(message="닉네임을 입력하세요.")
	private String member_nick;		 //4.닉네임
	@NotEmpty(message="이메일을 입력하세요.")
	private String member_email;	 //5.이메일
	@NotEmpty(message="성별을 클릭하세요.")
	private String member_gender;	 //6.성별
	
	@Length(min=8, max=8, message="8자리 연속 입력." )
	private int member_birth;		 //7.생년월일
	private Timestamp member_reg_dt; //8.가입일
	private int member_admin;		 //9.운영자여부(기본 0)
	private String member_like;		 //10.좋아요한 제품
	
	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pass() {
		return member_pass;
	}

	public void setMember_pass(String member_pass) {
		this.member_pass = member_pass;
	}

	public String getMember_nick() {
		return member_nick;
	}

	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_gender() {
		return member_gender;
	}

	public void setMember_gender(String member_gender) {
		this.member_gender = member_gender;
	}

	public int getMember_birth() {
		return member_birth;
	}

	public void setMember_birth(int member_birth) {
		this.member_birth = member_birth;
	}

	public Timestamp getMember_reg_dt() {
		return member_reg_dt;
	}

	public void setMember_reg_dt(Timestamp member_reg_dt) {
		this.member_reg_dt = member_reg_dt;
	}

	public int getMember_admin() {
		return member_admin;
	}

	public void setMember_admin(int member_admin) {
		this.member_admin = member_admin;
	}

	public String getMember_like() {
		return member_like;
	}

	public void setMember_like(String member_like) {
		this.member_like = member_like;
	}

        public BoardVO(){}
        
//        public BoardVO(String member_id, String member_pass, String member_nick, 
//        		String member_email, String member_gender, int member_birth, 
//        		int member_admin){
//                super();
//                this.member_id = member_id;
//                this.member_pass = member_pass;
//                this.member_nick = member_nick;
//                this.member_email = member_email;
//                this.member_gender = member_gender;
//                this.member_birth = member_birth;
//                this.member_admin = member_admin;
//        }

        
        
}
