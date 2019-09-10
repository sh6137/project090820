package board.domain;

import org.apache.ibatis.type.Alias;

@Alias("CategorytbVO")
public class CategorytbVO {
	private int cateNo;
	private String cateName;
	private String catesubCate;
	
	public CategorytbVO() {
		
	}
	public CategorytbVO(String cateName, String catesubCate) {
		super();
		this.cateName = cateName;
		this.catesubCate = catesubCate;
				
	}
	
	public int getCateNo() {
		return cateNo;
	}
	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getCatesubCate() {
		return catesubCate;
	}
	public void setCatesubCate(String catesubCate) {
		this.catesubCate = catesubCate;
	}
	
	
	
}
