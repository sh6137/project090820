package board.domain;


import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Alias("QuestiontbVO")
public class QuestiontbVO {
	private int queNo;
	
	@Length(min=2, max=5, message="제목은 2자이상, 5자 미만 입력해야 합니다.")
	private String queTitle;
	
	@NotEmpty(message="작성자를 입력하세요")
	private String queUser;
	
	@NotEmpty(message="내용을 입력하세요")
	private String queText;
	private int queReadCnt;
	
	@NotEmpty(message="카테고리내용을 입력하세요")
	private String queCategory;
	private Timestamp queRegDt;
	private int quePassword;
	
	public QuestiontbVO() {}
	
	public QuestiontbVO(String queTitle, String queUser, String queText, String queCategory, int quePassword) {
		super();
		this.queTitle = queTitle;
		this.queUser = queUser;
		this.queText = queText;
		this.queCategory = queCategory;
		this.quePassword = quePassword;
		this.queReadCnt=0;
		
		
		
	}

	public int getQueNo() {
		return queNo;
	}

	public void setQueNo(int queNo) {
		this.queNo = queNo;
	}

	public String getQueTitle() {
		return queTitle;
	}

	public void setQueTitle(String queTitle) {
		this.queTitle = queTitle;
	}

	public String getQueUser() {
		return queUser;
	}

	public void setQueUser(String queUser) {
		this.queUser = queUser;
	}

	public String getQueText() {
		return queText;
	}

	public void setQueText(String queText) {
		this.queText = queText;
	}

	public int getQueReadCnt() {
		return queReadCnt;
	}

	public void setQueReadCnt(int queReadCnt) {
		this.queReadCnt = queReadCnt;
	}

	public String getQueCategory() {
		return queCategory;
	}

	public void setQueCategory(String queCategory) {
		this.queCategory = queCategory;
	}

	public Timestamp getQueRegDt() {
		return queRegDt;
	}

	public void setQueRegDt(Timestamp queRegDt) {
		this.queRegDt = queRegDt;
	}

	public int getQuePassword() {
		return quePassword;
	}

	public void setQuePassword(int quePassword) {
		this.quePassword = quePassword;
	}
	
	

	
	
	
	
}
