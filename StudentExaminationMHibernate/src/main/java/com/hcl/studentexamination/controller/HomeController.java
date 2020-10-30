package com.hcl.studentexamination.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dudduguntaaji.reddy
 *
 */

@Controller
public class HomeController {

@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("redirect:user/registration");
		//return new ModelAndView("registration");
	}
}
