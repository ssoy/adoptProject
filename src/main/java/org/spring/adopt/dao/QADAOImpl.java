package org.spring.adopt.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.spring.adopt.dto.QADTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class QADAOImpl implements QADAO{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public int insert(QADTO qadto) {
		return session.insert("org.spring.adopt.QAMapper.insert",qadto);
	}

	@Override
	public int update(QADTO qadto) {
		return session.update("org.spring.adopt.QAMapper.update",qadto);
	}

	@Override
	public int delete(int qnum) {
		return session.delete("org.spring.adopt.QAMapper.delete",qnum);
	}

	@Override
	public QADTO selectOne(int qnum) {
		return session.selectOne("org.spring.adopt.QAMapper.selectOne",qnum);
	}

	@Override
	public List<QADTO> selectList(String key, String value) {
		//맵을 만들어서 전달
		Map<String,String> map = new HashMap<>();
		map.put("key",key);
		map.put("value",value);
		
		return session.selectList("org.spring.adopt.QAMapper.selectList",map);
	}

}
