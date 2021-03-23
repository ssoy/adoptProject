package org.spring.adopt.service;

import java.util.List;
import org.spring.adopt.dto.QADTO;



public interface QAService {
	//추가
	public int insert(QADTO mdto);
	//수정
	public int update(QADTO mdto);
	//삭제
	public int delete(int num);
	//한건조회
	public QADTO selectOne(int num);
	//전체조회
	public List<QADTO> selectList(String key, String value);

}
