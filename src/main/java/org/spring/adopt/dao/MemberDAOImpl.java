package org.spring.adopt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.spring.adopt.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSession session;
	
	@Override
	public int insert(MemberDTO mdto) {
		return session.insert("org.spring.adopt.MemberMapper.insert", mdto);
	}

	@Override
	public MemberDTO selectOne(String userid) {
		return session.selectOne("org.spring.adopt.MemberMapper.selectOne", userid);
	}

	@Override
	public int update(MemberDTO mdto) {
		return session.update("org.spring.adopt.MemberMapper.update", mdto);
	}

	@Override
	public void delete(String userid) {
		session.delete("org.spring.adopt.MemberMapper.delete", userid);
	}

}
