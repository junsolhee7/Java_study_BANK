package com.iu.start.board;

import java.sql.Date;

public class BoardDTO {

	private long writeNum;
	private String writeTitle;
	private String writeContent;
	private String writeUser;
	private Date writeDate;
	private Long hits;
	
	public long getWriteNum() {
		return writeNum;
	}
	public void setWriteNum(long writeNum) {
		this.writeNum = writeNum;
	}
	public String getWriteTitle() {
		return writeTitle;
	}
	public void setWriteTitle(String writeTitle) {
		this.writeTitle = writeTitle;
	}
	public String getWriteContent() {
		return writeContent;
	}
	public void setWriteContent(String writeContent) {
		this.writeContent = writeContent;
	}
	public String getWriteUser() {
		return writeUser;
	}
	public void setWriteUser(String writeUser) {
		this.writeUser = writeUser;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public Long getHits() {
		return hits;
	}
	public void setHits(Long hits) {
		this.hits = hits;
	}
	
	
	
	
	
}
