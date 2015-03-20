package br.com.hhc.sample.fullstackspringhibernate.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.hhc.sample.fullstackspringhibernate.core.service.StudentsService;
import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.StudentsDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Student;

@Service
@Transactional
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentsDAO stuDAO;

	public List<Student> getAllStudents() {
		return stuDAO.findAll();
	}

}
