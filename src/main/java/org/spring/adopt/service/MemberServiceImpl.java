package org.spring.adopt.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.spring.adopt.dao.MemberDAO;
import org.spring.adopt.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private FileService fservice;
	
	@Autowired
	private MemberDAO mdao;
	
	/* 암호화 필드 선언(DI) */
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	
	@Override
	public Map<String, Object> insert(MemberDTO mdto) {
		//리턴 저장변수(메세지, 성공여부(0:성공,-1:실패)
		Map<String, Object> resultMap = new HashMap<>();

		logger.info(mdto.toString());
		//기존 존재하는 회원일경우 리턴
		MemberDTO rdto = mdao.selectOne(mdto.getUserid());
		//rdto가 null 이 아니면 기존회원 존재
		if (rdto != null)  {
			logger.info("기존회원존재:" + rdto.toString());
			resultMap.put("msg", "기존회원이 존재");
			resultMap.put("result", -1); //가입실패
			return resultMap;
		}
		
		//파일처리 메소드를 결합도는 낮추고 응집도는 높이는 방법
		//1)파일처리 메소드 호출
		String filename = fservice.fileUpload(mdto.getUploadfile());
		mdto.setFilename(filename);
		logger.info(mdto.toString());
		
		//2)암호화 처리(평문->암호문)
		mdto.setPasswd(bcryptEncoder.encode(mdto.getPasswd()));
		
		//추가
		int cnt = mdao.insert(mdto);
		//resultMap.put("msg", "가입 완료");
		resultMap.put("result", 0); //가입 성공
		
		return resultMap;
	}


	//로그인
	@Override
	public Map<String, Object> login(String userid, String passwd) {
		//리턴 저장변수(메세지, 성공여부(0:성공,-1:실패))
		Map<String, Object> resultMap = new HashMap<>();
		
		//기존에 존재하는 회원인지 체크
		MemberDTO mdto = mdao.selectOne(userid);
		if (mdto == null) {
			//회원 미존재
			resultMap.put("msg", "아이디가 존재하지 않습니다.");
			resultMap.put("result", -1);
		}else {
			//기존에 존재하는 회원이면 패스워드 체크			
			//사용자가 입력한 패스워드와 기존에 db에 등록된 패스워드 매치
			//passwd평문을 암호화해서 매치여부 체크
			if (bcryptEncoder.matches(passwd, mdto.getPasswd())) {
				//로그인 성공
				//resultMap.put("msg", "로그인 성공");
				resultMap.put("result", 0);
			}else {
				//패스워드 불일치
				resultMap.put("msg", "패스워드가 일치하지 않습니다.");
				resultMap.put("result", -1);
			}
		}

		return resultMap;
	}

	
	@Override
	public MemberDTO selectOne(String userid) {
		return mdao.selectOne(userid);
	}

	//수정
	@Override
	public Map<String, Object> update(MemberDTO mdto) {
		//리턴 저장변수(메세지, 성공여부(0:성공,-1:실패))
		Map<String, Object> resultMap = new HashMap<>();
		
		//	기존비밀번호 불일치시 수정 불가
		MemberDTO dbdto = mdao.selectOne(mdto.getUserid());
		if (!bcryptEncoder.matches(mdto.getOldpasswd(), dbdto.getPasswd())) {
			//기존비밀번호와 일치하지 않으면
			resultMap.put("msg", "비밀번호 불일치");
			resultMap.put("result", -1);
			logger.info("비밀번호 불일치");
			return resultMap;
		}
		
		if (mdto.getPasswd().equals("")) {
			//변경비밀번호가 없다면 기존비밀번호 암호화해서 저장
			mdto.setPasswd(bcryptEncoder.encode(mdto.getOldpasswd()));
			logger.info("기존비밀번호");
		}else {
			//변경비밀번호가 있다면 변경비밀번호 암호화해서 저장
			mdto.setPasswd(bcryptEncoder.encode(mdto.getPasswd()));
			logger.info("변경비밀번호");
		}
		
		//파일처리
		String filename = fservice.fileUpload(mdto.getUploadfile());
		//파일이름이 있다면 파일이름 수정
		if (!filename.equals("")) {
			mdto.setFilename(filename);
		}

		logger.info(mdto.toString());
		mdao.update(mdto);
		
		//resultMap.put("msg", "수정완료");
		resultMap.put("result", 0);
		return resultMap;		
	}

	//삭제
	@Override
	public Map<String, Object> delete(String userid) {
		//리턴 저장변수(메세지)
		Map<String, Object> resultMap = new HashMap<>();
		
		mdao.delete(userid);
		//resultMap.put("msg", "회원탈퇴 완료");
		return resultMap;
	}

}
