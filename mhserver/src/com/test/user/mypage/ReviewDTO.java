package com.test.user.mypage;

/**
 * @author 신수진
 * 상품후기 DTO
 */
public class ReviewDTO {

	private String seq;
	private String orderdetailseq;
	private String title;
	private String content;
	private String image;
	private String regdate;
	private int readcount;
	private String pname;
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getOrderdetailseq() {
		return orderdetailseq;
	}
	public void setOrderdetailseq(String orderdetailseq) {
		this.orderdetailseq = orderdetailseq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
