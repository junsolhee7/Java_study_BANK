package com.iu.start.bankBook;

public class BankBookDTO {
	
	private Long bookNum;
	private String bookName;
	private Double bookRate;
	private Integer bookSale;
	
	private Long getBookNum() {
		return bookNum;
	}
	private void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	private String getBookName() {
		return bookName;
	}
	private void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private Double getBookRate() {
		return bookRate;
	}
	private void setBookRate(Double bookRate) {
		this.bookRate = bookRate;
	}
	private Integer getBookSale() {
		return bookSale;
	}
	private void setBookSale(Integer bookSale) {
		this.bookSale = bookSale;
	}
	

}
