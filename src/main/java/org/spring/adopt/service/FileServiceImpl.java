package org.spring.adopt.service;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService{

	private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);
	
	//스프링이 만든 bean을 주입
	//root-context.xml에 bean정의
	@Autowired
	String saveDir;
	
	@Override
	public String fileUpload(MultipartFile file) {
		//파일을 폴더에 저장하고 파일명을 리턴하는 메소드
		
		if (file.isEmpty()) return ""; //파일이 없다면 리턴
		
		//유일한 번호를 생성해서 파일의 이름을 만든다
		String filename = System.currentTimeMillis() + file.getOriginalFilename();
		logger.info(filename);
		
		File f = new File(saveDir,filename);
		
		try {
			file.transferTo(f); //파일 폴더에 저장
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filename;
	}

}
