package com.hcl.studentexamination.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.studentexamination.model.User;
import com.hcl.studentexamination.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserRegistrationController {
	@Autowired
	UserServiceImpl userService;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid User user, BindingResult result) {
		if (result.hasErrors()) 
			return new ModelAndView("registration");
		else
			return new ModelAndView("loginSuccess");
	}

	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("registration","user", new User());

	}
}


