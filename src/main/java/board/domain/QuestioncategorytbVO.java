package board.domain;

import org.apache.ibatis.type.Alias;

@Alias("QuestioncategorytbVO")
public class QuestioncategorytbVO {
	
	private int quecateNum;
	private String quecateCat;
	
	
	public QuestioncategorytbVO() {
		
	}
	
	public QuestioncategorytbVO(String quecateCat, int quecatePass) {
		super();
		this.quecateCat = quecateCat;
		
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
	
	

}
