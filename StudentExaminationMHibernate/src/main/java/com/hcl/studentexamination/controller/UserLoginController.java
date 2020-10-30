package com.hcl.studentexamination.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.studentexamination.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserLoginController {
		@Autowired
		public UserServiceImpl userService;

		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public ModelAndView add(@ModelAttribute @Valid Login login, BindingResult result) {
			if (result.hasErrors()) {
				return new ModelAndView("login");
			} else {
				if (userService.login(login))
					return new ModelAndView("loginSuccess");
				else
					return new ModelAndView("loginFailed");
			}
		}

		@RequestMapping("/login")
	    public ModelAndView add() {

	 

	        // return new ModelAndView("redirect:user/login");
	        return new ModelAndView("login", "login", new Login());

	 

}
