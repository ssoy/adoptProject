package org.spring.adopt.dao;

import java.util.List;

import org.spring.adopt.dto.BoardDTO;
import org.spring.adopt.dto.PageDTO;

public interface BoardDAO {
	public List<BoardDTO> selectList(PageDTO pdto) throws Exception;
	public BoardDTO selectOne(int bnum) throws Exception;
	public void insert(BoardDTO bdto) throws Exception;
	public void update(BoardDTO bdto) throws Exception;
	public void delete(int bnum) throws Exception;
	//조회수+1
	public void updateReadCount(int bnum) throws Exception;
	
	//전체 건수 조회
	public int selectTotCnt(PageDTO pdto);
	
	
	
	
	
}