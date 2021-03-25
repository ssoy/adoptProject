package org.spring.adopt.service;

import java.util.Map;

import org.spring.adopt.dto.MemberDTO;

public interface MemberService {
	//로그인
	public Map<String, Object> login(String userid, String passwd);
	//추가
	public Map<String, Object> insert(MemberDTO mdto);
	//한건조회
	public MemberDTO selectOne(String userid);
	//수정
	public Map<String, Object> update(MemberDTO mdto);
	
	//삭제
	public Map<String, Object> delete(String userid);
	
	
}
