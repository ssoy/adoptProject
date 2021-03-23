package org.spring.adopt.dto;

public class BoardDTO {
	private int bnum;
	private String userid;
	private String subject;
	private String content;
	private int readcount;
	private String ip;
	private String regdate;
	private String modifydate;
	public BoardDTO() {
		super();
	}
	public BoardDTO(int bnum, String userid, String subject, String content, int readcount, String ip, String regdate,
			String modifydate) {
		super();
		this.bnum = bnum;
		this.userid = userid;
		this.subject = subject;
		this.content = content;
		this.readcount = readcount;
		this.ip = ip;
		this.regdate = regdate;
		this.modifydate = modifydate;
	}
	public BoardDTO(String userid, String subject, String content, int readcount, String regdate) {
		super();
		this.userid = userid;
		this.subject = subject;
		this.content = content;
		this.readcount = readcount;
		this.regdate = regdate;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getModifydate() {
		return modifydate;
	}
	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}
	@Override
	public String toString() {
		return "BoardDTO [bnum=" + bnum + ", userid=" + userid + ", subject=" + subject + ", content=" + content
				+ ", readcount=" + readcount + ", ip=" + ip + ", regdate=" + regdate + ", modifydate=" + modifydate
				+ "]";
	}
	
	
	
	
}