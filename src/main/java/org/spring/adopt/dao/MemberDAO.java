package org.spring.adopt.dao;

import org.spring.adopt.dto.MemberDTO;

public interface MemberDAO {
	public int insert(MemberDTO mdto);
	public MemberDTO selectOne(String userid);
	public int update(MemberDTO mdto);
	public void delete(String userid); 


}
