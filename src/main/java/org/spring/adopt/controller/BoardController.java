package org.spring.adopt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.adopt.dto.BoardDTO;
import org.spring.adopt.dto.PageDTO;
import org.spring.adopt.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("board")
//@SessionAttributes("pdto") //세션을 생성
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	@Autowired 
	private BoardService bservice;
	 

	
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET) public String
	  list(@ModelAttribute("pdto") PageDTO pdto, Model model) {
	  //@ModelAttribute("pdto") =>@SessionAttributes("pdto")에 저장
	  model.addAttribute("pdto",pdto); return "board/list"; }
	  
	  //조회버튼 또는 페이지를 눌렀을때
	  
	  @ResponseBody
	  
	  @RequestMapping(value = "/list", method = RequestMethod.GET) public
	  Map<String, Object> list(@ModelAttribute("pdto") PageDTO pdto) throws
	  Exception { return bservice.selectList(pdto); }
	  
	 
	

}
