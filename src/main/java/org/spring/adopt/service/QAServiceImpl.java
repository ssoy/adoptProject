package org.spring.adopt.service;

import java.util.List;
import java.util.Map;

import org.spring.adopt.dao.QADAO;
import org.spring.adopt.dto.QADTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service
public class QAServiceImpl implements QAService{
	
	//view->controller->service->dao->oracle
	
	@Autowired
	private QADAO qadao;

	@Override
	public int insert(QADTO qadto) {
		return qadao.insert(qadto);
	}

	@Override
	public int update(QADTO qadto) {
		return qadao.update(qadto);
	}

	@Override
	public int delete(int qnum) {
		return qadao.delete(qnum);
	}

	@Override
	public QADTO selectOne(int qnum) {
		return qadao.selectOne(qnum);
	}

	@Override
	public List<QADTO> selectList(String key, String value) {
		return qadao.selectList(key, value);
	}


}
