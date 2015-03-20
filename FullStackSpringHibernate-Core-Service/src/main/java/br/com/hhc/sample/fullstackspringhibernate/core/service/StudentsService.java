package br.com.hhc.sample.fullstackspringhibernate.core.service;

import java.util.List;

import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Student;


public interface StudentsService {
	List<Student> getAllStudents();
}
