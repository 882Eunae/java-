package review;

import java.util.Date;

public  class board {
//제목,컨텐츠,작성자,작성날짜 
	
	private String title;
	private  String content; 
	private String writer; 
	private Date writeDate;
	
	public board(String title, String content, String writer, Date writeDate) {
		//super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public void showboard() {
		// TODO Auto-generated method stub
		
	} 
	
	
	

}