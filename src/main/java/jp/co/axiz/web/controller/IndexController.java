package jp.co.axiz.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.axiz.web.entity.SessionInfo;

@Controller
public class IndexController {

	@Autowired
	private SessionInfo sessionInfo;

	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping("/menu")
	public String menu(Model model) {
		model.addAttribute("user", sessionInfo.getLoginUser());
		return "menu";
	}

}
