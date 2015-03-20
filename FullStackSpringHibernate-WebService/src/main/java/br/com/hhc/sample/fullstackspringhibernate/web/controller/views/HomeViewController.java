package br.com.hhc.sample.fullstackspringhibernate.web.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hhc.sample.fullstackspringhibernate.web.controller.BaseController;

@Controller
@RequestMapping(value = "/view/home")
public class HomeViewController extends BaseController{

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public final  String renderHome() {
		return "home";
	}
}
