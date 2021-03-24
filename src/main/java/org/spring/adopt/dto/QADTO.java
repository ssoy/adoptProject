package org.spring.adopt.dto;

public class QADTO {
	private int qnum;
	private String qchoose;
	private String userid;
	private String qsubject;
	private String qcontent;
	private String regdate;
	public QADTO(int qnum, String qchoose, String userid, String qsubject, String qcontent, String regdate) {
		super();
		this.qnum = qnum;
		this.qchoose = qchoose;
		this.userid = userid;
		this.qsubject = qsubject;
		this.qcontent = qcontent;
		this.regdate = regdate;
	}
	public QADTO() {
		super();
	}
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public String getQchoose() {
		return qchoose;
	}
	public void setQchoose(String qchoose) {
		this.qchoose = qchoose;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getQsubject() {
		return qsubject;
	}
	public void setQsubject(String qsubject) {
		this.qsubject = qsubject;
	}
	public String getQcontent() {
		return qcontent;
	}
	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "QADTO [qnum=" + qnum + ", qchoose=" + qchoose + ", userid=" + userid + ", qsubject=" + qsubject
				+ ", qcontent=" + qcontent + ", regdate=" + regdate + "]";
	}
	
	
	
	
}
