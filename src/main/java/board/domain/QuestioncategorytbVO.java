package board.domain;

import org.apache.ibatis.type.Alias;

@Alias("QuestioncategorytbVO")
public class QuestioncategorytbVO {
	
	private int quecateNum;
	private String quecateCat;
	private int quecatePass;
	
	public QuestioncategorytbVO() {
		
	}
	
	public QuestioncategorytbVO(String quecateCat, int quecatePass) {
		super();
		this.quecateCat = quecateCat;
		this.quecatePass = quecatePass;
	}
	
	public int getQuecateNum() {
		return quecateNum;
	}
	public void setQuecateNum(int quecateNum) {
		this.quecateNum = quecateNum;
	}
	public String getQuecateCat() {
		return quecateCat;
	}
	public void setQuecateCat(String quecateCat) {
		this.quecateCat = quecateCat;
	}
	public int getQuecatePass() {
		return quecatePass;
	}
	public void setQuecatePass(int quecatePass) {
		this.quecatePass = quecatePass;
	}
	
	

}
