package board.domain;

import org.apache.ibatis.type.Alias;

@Alias("QuestioncategorytbVO")
public class QuestioncategorytbVO {
	
	private int quecateNum;
	private String quecateCate;
	
	
	public QuestioncategorytbVO() {
		
	}
	
	public QuestioncategorytbVO(String quecateCate, int quecatePass) {
		super();
		this.quecateCate = quecateCate;
		
	}
	
	public int getQuecateNum() {
		return quecateNum;
	}
	public void setQuecateNum(int quecateNum) {
		this.quecateNum = quecateNum;
	}
	public String getQuecateCate() {
		return quecateCate;
	}
	public void setQuecateCate(String quecateCate) {
		this.quecateCate = quecateCate;
	}
	
	

}
