package org.spring.adopt.dao;

import org.spring.adopt.dto.MemberDTO;

public interface MemberDAO {
	//일반유저
	public MemberDTO selectOne(String userid);
	public int insert(MemberDTO mdto);
	//네이버간편가입 유저
	public MemberDTO selectOneNaver(String email);
	public int insertNaver(String email);
	
	public void emailauthUpdate(String userid);
}
