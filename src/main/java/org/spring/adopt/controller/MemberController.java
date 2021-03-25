package org.spring.adopt.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.spring.adopt.dto.MemberDTO;
import org.spring.adopt.service.MemberService;

//회원관리 컨트롤러
@Controller
@RequestMapping("member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService service;
	
	//회원가입폼으로 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "member/join";
	}
	
	//회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberDTO mdto, Model model, RedirectAttributes rattr) {
		logger.info(mdto.toString());
		Map<String,Object>  resultMap = service.insert(mdto);
		//반환값을 이용해서 메시지 view에 출력
		logger.info(resultMap.toString());
		
		//가입실패시(-1) join으로 이동, 성공시(0) main으로 이동
		if ((int)resultMap.get("result")==0){
			//redirect 메시지 보내기
			rattr.addFlashAttribute("msg",resultMap.get("msg"));
			return "redirect:/"; //절대경로
		}else {
			model.addAttribute("msg",resultMap.get("msg"));
			return "member/join";
		}
	}
	
	//내정보폼으로 이동
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info(HttpSession session, Model model) {
		String userid = (String) session.getAttribute("userid");
		logger.info(userid);
		MemberDTO mdto = service.selectOne(userid);
		logger.info(mdto.toString());
		model.addAttribute("mdto", mdto);
		return "member/info";
	}
	
	//수정폼으로 이동
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(HttpSession session, Model model) {
		String userid = (String) session.getAttribute("userid");
		MemberDTO mdto = service.selectOne(userid);
		logger.info(mdto.toString());
		model.addAttribute("mdto", mdto);
		return "member/modify";
	}
	
	//회원수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(@ModelAttribute("mdto") MemberDTO mdto, Model model, RedirectAttributes rattr) {
		logger.info(mdto.toString());
		Map<String,Object> resultMap = service.update(mdto);
		//수정실패시(-1) modify으로 이동, 성공시(0) info으로 이동
		if ((int)resultMap.get("result")==0) {
			rattr.addFlashAttribute("msg",resultMap.get("msg"));
			return "redirect:info"; //상대경로
		}else {
			model.addAttribute("msg",resultMap.get("msg"));
			return "member/modify";
		}
		
	}
	
	//회원탈퇴
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(HttpSession session, Model model, RedirectAttributes rattr) {
		String userid = (String) session.getAttribute("userid");
		Map<String,Object> resultMap = service.delete(userid);
		session.invalidate(); //세션의 모든정보 소멸
		rattr.addFlashAttribute("msg",resultMap.get("msg"));
		return "redirect:/"; 
	}
	
	//주소 팝업창 띄우기
	@RequestMapping(value = "/jusoPopup")
	public String jusoPopup() {
		
		return "member/jusoPopup";
	}
	
	
	
	
	
	
	
	
	
	
	
}
