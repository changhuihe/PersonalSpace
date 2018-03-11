package com.hch.controller.userRelatedController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hch.entity.userRelatedEntity.User;
import com.hch.service.userRelatedService.UserService;
import com.hch.sys.AjaxMessage;
import com.hch.util.MD5Util;

@Controller
@RequestMapping("/loginController/")
public class LoginController {

	@Autowired
	public UserService userService;

	@RequestMapping("login")
	public String login() {
		return "jsp/userRelatedJsp/login";
	}

	/*
	 * 注册
	 */
	@RequestMapping("register")
	@ResponseBody
	public AjaxMessage<User> register(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User();
		User temporaryUser = null;
		AjaxMessage<User> ajaxMessage = new AjaxMessage<User>();
		if (name != "" && name != null) {
			temporaryUser = userService.findByName(name);
			if (temporaryUser != null) {
				ajaxMessage.setFlag(false);
				ajaxMessage.setMessage("用户名已存在!");
				return ajaxMessage;
			} else {
				user.setName(name);
			}
		}
		if (email != "" && email != null) {
			temporaryUser = userService.findByEmail(email);
			if (temporaryUser != null) {
				ajaxMessage.setFlag(false);
				ajaxMessage.setMessage("邮箱已存在!");
				return ajaxMessage;
			} else {
				user.setEmail(email);
			}
		}
		user.setPassword(MD5Util.string2MD5(password));
		userService.insert(user);
		ajaxMessage.setFlag(true);
		ajaxMessage.setMessage("注册成功!");
		ajaxMessage.setE(user);
		return ajaxMessage;
	}

}
