package org.spring.adopt.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.adopt.dto.QADTO;
import org.spring.adopt.service.QAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping(value="QA")
@Controller
public class QAController {
	
	private static final Logger logger = LoggerFactory.getLogger(QAController.class);
	
	@Autowired
	private QAService service;
	
	
	//조회폼으로이동
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list() {
		return "QA/list";
	}
	
	
	//전체조회
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String QAlist(@RequestParam(defaultValue = "subject") String key, String value, Model model) {
		logger.info(key);
		logger.info(value);
		List<QADTO> QAlist = service.selectList(key, value);
		logger.info(QAlist.toString());
		model.addAttribute("QAlist", QAlist);
		model.addAttribute("key", key);
		model.addAttribute("value", value);
		
		return "QA/list";
	}	
	
	//추가폼으로 이동
	@RequestMapping(value="add", method = RequestMethod.GET)
	public String QAadd() {
		return "QA/add";
	}	
	
	//추가
	@RequestMapping(value="add", method = RequestMethod.POST)
	public String QAadd(QADTO qadto,RedirectAttributes rattr) {
		logger.info(qadto.toString());
		service.insert(qadto);
		//redirect 이동
		//rattr.addAttribute("msg", "추가 완료");
		//addFlashAttribute : 일회성 정보 보낼때
		rattr.addFlashAttribute("msg", "추가 완료");
		return "redirect:QA/list";
	}
	
	//detail폼으로 이동
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public String moviedetail(@RequestParam("num") int num, Model model) {
		logger.info("번호:" + num);
		QADTO qadto = service.selectOne(num);
		logger.info(qadto.toString());
		model.addAttribute("qadto", qadto);
		return "QA/detail";
		
	}	
	
	//수정폼으로 이동
	@RequestMapping(value="update", method = RequestMethod.GET)
	public String QAupdate(int num, Model model) {
		logger.info("번호:" + num);
		QADTO qadto = service.selectOne(num);
		logger.info(qadto.toString());
		model.addAttribute("qadto", qadto);
		return "QA/update";
	}	
	
	//수정으로 이동
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String QAupdate(QADTO qadto, Model model, RedirectAttributes rdatt) {
		logger.info(qadto.toString());
		service.update(qadto);
		rdatt.addAttribute("num", qadto.getNum());
		rdatt.addFlashAttribute("msg", "수정완료");
		return "redirect:QA/detail";
	}	
	
	//삭제
	@RequestMapping(value="delete")
	public String QAdelete(int num) {
		logger.info("번호:" + num);
		int cnt = service.delete(num);
		logger.info(cnt+"건");
		
		return "redirect:QA/list";
	}	
	
	
	
	
}
