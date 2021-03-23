package org.spring.adopt.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.spring.adopt.dto.PageDTO;
import org.spring.adopt.dto.QADTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class QADAOImpl implements QADAO{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public int insert(QADTO qadto) {
		return session.insert("QAMapper.insert",qadto);
	}

	@Override
	public int update(QADTO qadto) {
		return session.update("QAMapper.update",qadto);
	}

	@Override
	public int delete(int num) {
		return session.delete("QAMapper.delete",num);
	}

	@Override
	public QADTO selectOne(int num) {
		return session.selectOne("QAMapper.selectOne",num);
	}

	@Override
	public List<QADTO> selectList(String key, String value) {
		//맵을 만들어서 전달
		Map<String,String> map = new HashMap<>();
		map.put("key",key);
		map.put("value",value);
		
		return session.selectList("QAMapper.selectList",map);
	}

}
