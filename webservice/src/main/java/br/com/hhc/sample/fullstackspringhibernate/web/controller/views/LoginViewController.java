package br.com.hhc.sample.fullstackspringhibernate.web.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hhc.sample.fullstackspringhibernate.web.controller.BaseController;

@Controller
@RequestMapping(value = "/view")
public class LoginViewController extends BaseController {
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public final  String renderLogin( ) {
		return "login";
	}
	
	
	@RequestMapping(value = "/logout", method = {RequestMethod.GET,RequestMethod.POST})
	public final  String renderLogout( ) {
		return "logout";
	}

}
