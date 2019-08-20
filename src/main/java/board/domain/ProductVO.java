package board.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("ProductVO")
public class ProductVO {
	private int proNo;
	private String proName;
	private String proCate;
	private String proSubCat;
	private String proText;
	private int proReadCnt;
	private int proLikeCnt;
	private Date proRegDate;
	private String proThumbnail;
	private String proSysThumbnail;
	private String proFileName;
	private String proFileSysName;
	
	public int getProNo() {
		return proNo;
	}	//d
	public void setProNo(int proNo) {
		this.proNo = proNo;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProCate() {
		return proCate;
	}
	public void setProCate(String proCate) {
		this.proCate = proCate;
	}
	public String getProSubCat() {
		return proSubCat;
	}
	public void setProSubCat(String proSubCat) {
		this.proSubCat = proSubCat;
	}
	public String getProText() {
		return proText;
	}
	public void setProText(String proText) {
		this.proText = proText;
	}
	public int getProReadCnt() {
		return proReadCnt;
	}
	public void setProReadCnt(int proReadCnt) {
		this.proReadCnt = proReadCnt;
	}
	public int getProLikeCnt() {
		return proLikeCnt;
	}
	public void setProLikeCnt(int proLikeCnt) {
		this.proLikeCnt = proLikeCnt;
	}
	public Date getProRegDate() {
		return proRegDate;
	}
	public void setProRegDate(Date proRegDate) {
		this.proRegDate = proRegDate;
	}
	public String getProThumbnail() {
		return proThumbnail;
	}
	public void setProThumbnail(String proThumbnail) {
		this.proThumbnail = proThumbnail;
	}
	public String getProSysThumbnail() {
		return proSysThumbnail;
	}
	public void setProSysThumbnail(String proSysThumbnail) {
		this.proSysThumbnail = proSysThumbnail;
	}
	public String getProFileName() {
		return proFileName;
	}
	public void setProFileName(String proFileName) {
		this.proFileName = proFileName;
	}
	public String getProFileSysName() {
		return proFileSysName;
	}
	public void setProFileSysName(String proFileSysName) {
		this.proFileSysName = proFileSysName;
	}
	
}