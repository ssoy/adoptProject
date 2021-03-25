package org.spring.adopt.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	//파일을 폴더에 저장하고 파일명을 리턴하는 메소드
	public String fileUpload(MultipartFile file);
}
