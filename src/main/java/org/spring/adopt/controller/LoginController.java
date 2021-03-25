package org.spring.adopt.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.spring.adopt.service.MemberService;

@RequestMapping("member")
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private MemberService mservice;
	

	//로그인 폼으로 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}
	
	//로그인 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String userid, String passwd, 
			HttpSession session,
			RedirectAttributes rattr, Model model) {
		logger.info(userid+":"+passwd);
		Map<String,Object> resultMap = mservice.login(userid, passwd);
		//로그인실패시(-1) login으로 이동, 성공시(0) main으로 이동
		if ((int)resultMap.get("result")==0){
			//세션에 userid저장
			session.setAttribute("userid", userid);
			session.setMaxInactiveInterval(60*60*100);
			//redirect 메시지 보내기
			rattr.addFlashAttribute("msg",resultMap.get("msg"));
			return "redirect:/"; //절대경로			
		}else {
			model.addAttribute("msg",resultMap.get("msg"));
			return "member/login";
		}
		

	}
	
	//로그아웃 
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session,RedirectAttributes rattr) {
		session.invalidate(); //세션의 모든정보 소멸
		rattr.addFlashAttribute("msg", "로그아웃 되었습니다.");
		return "redirect:/";
	}
	
	
}
