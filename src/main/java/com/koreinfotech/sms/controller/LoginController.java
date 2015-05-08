package com.koreinfotech.sms.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.koreinfotech.sms.domain.User;
import com.koreinfotech.sms.service.UserService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	@Autowired
	private UserService userService;
	
		@RequestMapping(value = "/smslogin", method = RequestMethod.GET)
		public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
			
			logger.info("Inside login");

			ModelAndView mav = new ModelAndView("login","user",new User());
			
			if (error != null) {
				mav.addObject("error", "Invalid username and password!");
				
			}
	 
			if (logout != null) {
				mav.addObject("msg", "You've been logged out successfully.");
			}			
	 
			return mav;
	 
		}
		
		@RequestMapping(value="/addNewUserForm",method = RequestMethod.GET)
		public ModelAndView addNewUserForm(){
			
			logger.info("Inside addNewUserForm()");
			ModelAndView mav = new ModelAndView("addNewUser","user",new User());
			return mav;
		}
		
		@RequestMapping(value="/addNewUser",method = RequestMethod.POST)
		public String addNewUser(@Valid User user, BindingResult result, Model m){
			
			logger.info("User details : " + user);
			
			if ( !result.hasErrors()){
				userService.addUser(user);
				m.addAttribute("msg", "Successfully saved user " );
				m.addAttribute("user", new User());
			}
			
			return "addNewUser";
				
			
		}

}
