package org.spring.adopt.dao;

import java.util.List;

import org.spring.adopt.dto.PageDTO;
import org.spring.adopt.dto.QADTO;



public interface QADAO {
	
	//추가
	public int insert(QADTO qadto);
	//수정
	public int update(QADTO qadto);
	//삭제
	public int delete(int qnum);
	//한건조회
	public QADTO selectOne(int qnum);
	//전체조회
	public List<QADTO> selectList(String key, String value);
	
}
