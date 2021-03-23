package org.spring.adopt.dto;

public class QADTO {
	private int num;
	private String userid;
	private String subject;
	private String content;
	private int readcount;
	private String regdate;
	public QADTO() {
		super();
	}
	public QADTO(int num, String userid, String subject, String content, int readcount, String regdate) {
		super();
		this.num = num;
		this.userid = userid;
		this.subject = subject;
		this.content = content;
		this.readcount = readcount;
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "QADTO [num=" + num + ", userid=" + userid + ", subject=" + subject + ", content=" + content
				+ ", readcount=" + readcount + ", regdate=" + regdate + "]";
	}
	
	
	
}
