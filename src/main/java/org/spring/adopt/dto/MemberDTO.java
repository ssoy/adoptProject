package org.spring.adopt.dto;

import org.springframework.web.multipart.MultipartFile;

public class MemberDTO {
	private String userid;
	private String passwd;
	private String oldpasswd; //기존 패스워드
	private String email;
	private String zip;
	private String addr1;
	private String addr2;
	private String filename;
	private MultipartFile uploadfile; //파일
	private String regdate;
	public MemberDTO() {
		super();
	}
	public MemberDTO(String userid, String passwd, String email, String zip, String addr1,String addr2, String filename) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
		this.zip = zip;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.filename = filename;
	}

	public MemberDTO(String userid, String passwd, String oldpasswd, String email, String zip, String addr1,
			String addr2, String filename, MultipartFile uploadfile, String regdate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.oldpasswd = oldpasswd;
		this.email = email;
		this.zip = zip;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.filename = filename;
		this.uploadfile = uploadfile;
		this.regdate = regdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getOldpasswd() {
		return oldpasswd;
	}
	public void setOldpasswd(String oldpasswd) {
		this.oldpasswd = oldpasswd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", oldpasswd=" + oldpasswd + ", email=" + email
				+ ", zip=" + zip + ", addr1=" + addr1 + ", addr2=" + addr2 + ", filename=" + filename + ", uploadfile="
				+ uploadfile + ", regdate=" + regdate + "]";
	}

	
	
	
}
