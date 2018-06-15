package jp.co.axiz.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.SessionInfo;
import jp.co.axiz.web.entity.UserInfo;
import jp.co.axiz.web.form.InsertForm;
import jp.co.axiz.web.service.impl.UserInfoService;

@Controller
public class InsertController {

	@Autowired
	private SessionInfo sessionInfo;

	@Autowired
    MessageSource messageSource;

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/insert")
	public String insert(@ModelAttribute("insertForm") InsertForm form, Model model) {
		return "insert";
	}

	@RequestMapping(value = "/insertConfirm", method = RequestMethod.POST)
	public String insertConfirm(@Validated @ModelAttribute("insertForm") InsertForm form, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			String errorMsg = messageSource.getMessage("required.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);
			return "insert";
		}

		UserInfo user = new UserInfo();
		user.setUserName(form.getName());
		user.setTelephone(form.getTel());
		user.setPassword(form.getPassword());

		sessionInfo.setNewUser(user);

		return "insertConfirm";
	}

	@RequestMapping(value = "/insertBack")
	public String insertBack(@ModelAttribute("insertForm") InsertForm form, Model model) {

		UserInfo user = sessionInfo.getNewUser();

		form.setName(user.getUserName());
		form.setTel(user.getTelephone());
		form.setPassword(user.getPassword());

		return "insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertExecute(@Validated @ModelAttribute("insertForm") InsertForm form, BindingResult bindingResult,
			Model model) {

		UserInfo user = sessionInfo.getNewUser();

		if(!user.getPassword().equals(form.getConfirmPassword())) {
			String errorMsg = messageSource.getMessage("password.not.match.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);

			form.setConfirmPassword("");

			return "insertConfirm";
		}

		int id = userInfoService.insert(user);

		sessionInfo.setNewUser(null);

		form.setUserId(id);

		model.addAttribute("user", sessionInfo.getLoginUser());

		return "insertResult";
	}
}
