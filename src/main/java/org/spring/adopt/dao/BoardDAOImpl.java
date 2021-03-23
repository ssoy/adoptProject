package org.spring.adopt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.spring.adopt.dto.BoardDTO;
import org.spring.adopt.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSession session;

	@Override
	public List<BoardDTO> selectList(PageDTO pdto) throws Exception {
		return session.selectList("org.spring.adopt.BoardMapper.selectList", pdto);
	}

	@Override
	public BoardDTO selectOne(int bnum) throws Exception {
		return session.selectOne("org.spring.adopt.BoardMapper.selectOne", bnum);
	}

	@Override
	public void insert(BoardDTO bdto) throws Exception {
		session.insert("org.spring.adopt.BoardMapper.insert", bdto);
	}

	@Override
	public void update(BoardDTO bdto) throws Exception {
		session.update("org.spring.adopt.BoardMapper.update", bdto);
	}

	@Override
	public void delete(int bnum) throws Exception {
		session.delete("org.spring.adopt.BoardMapper.delete",bnum);
		
	}

	@Override
	public void updateReadCount(int bnum) throws Exception {
		session.update("org.spring.adopt.BoardMapper.updateReadCount",bnum);
	}


	@Override
	public int selectTotCnt(PageDTO pdto) {
		return session.selectOne("org.spring.adopt.BoardMapper.selectTotCnt", pdto);
	}

}
