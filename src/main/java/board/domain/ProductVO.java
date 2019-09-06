package board.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

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
	private String proSystemThumbnail;
	private String proFileName;
	private String proFileSystemName;
	
	private MultipartFile proMultipart;
	
	public MultipartFile getProMultipart() {
		return proMultipart;
	}
	public void setProMultipart(MultipartFile proMultipart) {
		this.proMultipart = proMultipart;
	}
	public int getProNo() {
		return proNo;
	}
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
	public String getProSystemThumbnail() {
		return proSystemThumbnail;
	}
	public void setProSystemThumbnail(String proSystemThumbnail) {
		this.proSystemThumbnail = proSystemThumbnail;
	}
	public String getProFileName() {
		return proFileName;
	}
	public void setProFileName(String proFileName) {
		this.proFileName = proFileName;
	}
	public String getProFileSystemName() {
		return proFileSystemName;
	}
	public void setProFileSystemName(String proFileSystemName) {
		this.proFileSystemName = proFileSystemName;
	}
	
}