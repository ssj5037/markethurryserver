package com.test.crawler;

public class Review {

	private int orderListSeq;
	private String title;
	private String content;
	private String img;
	private String date;
	
	public int getOrderListSeq() {
		return orderListSeq;
	}
	public void setOrderListSeq(int orderListSeq) {
		this.orderListSeq = orderListSeq;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	private int readCount;
}
