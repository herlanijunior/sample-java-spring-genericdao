package br.com.hhc.sample.fullstackspringhibernate.web.controller.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginLogOutServiceController {

/*	
 
  @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
 
	public String welcomePage(ModelAndView model) {

		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		// model.setViewName("home");
		return "home";

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public String adminPage(ModelAndView model) {

		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		// model.setViewName("home");
		return "home";

	}
	*/

	// Spring Security see this :
	@RequestMapping(value = "/service/login", method = { RequestMethod.GET,RequestMethod.POST })
	public String login(
			@RequestParam(value = "error", required = false) String error,
			ModelAndView model) {

		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		return "login";
	}
	
	
	@RequestMapping(value = "/service/logout", method = { RequestMethod.GET,RequestMethod.POST })
	public String logout(
			@RequestParam(value = "error", required = false) String error,
			ModelAndView model) {

			model.addObject("msg", "You've been logged out successfully.");
		return "login";
	}

}