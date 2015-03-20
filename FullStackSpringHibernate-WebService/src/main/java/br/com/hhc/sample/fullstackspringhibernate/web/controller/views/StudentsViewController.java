package br.com.hhc.sample.fullstackspringhibernate.web.controller.views;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.hhc.sample.fullstackspringhibernate.core.service.StudentsService;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Student;
import br.com.hhc.sample.fullstackspringhibernate.web.controller.BaseController;

@Controller
@RequestMapping(value = "/view/students")
public class StudentsViewController extends BaseController{
	
	@Autowired
	private StudentsService studentsProxy;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public final  ModelAndView renderHome() {
		final Map<String, Object> models = new HashMap<String, Object>();
		models.put("studentsList", studentsProxy.getAllStudents());
		
		return new ModelAndView("students/home", models);
	}
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public @ResponseBody List<Student>  listAll()  {
		return studentsProxy.getAllStudents();
	}	
}
