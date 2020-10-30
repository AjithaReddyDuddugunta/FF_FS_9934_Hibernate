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
public class ListController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid student list, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("list");
		} else {
			if (userService.list(list))
				return new ModelAndView("list");
			else
				return new ModelAndView("loginFailed");
		}
	}

	@RequestMapping("/list")
    public ModelAndView add() {
        // return new ModelAndView("redirect:user/login");
        return new ModelAndView("list", "list", new student());

 

    }

}
