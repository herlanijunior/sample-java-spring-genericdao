package br.com.hhc.sample.fullstackspringhibernate.database.data.dao;

import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Student;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

public interface StudentsDAO extends GenericDAO<Student, Integer> {

}
