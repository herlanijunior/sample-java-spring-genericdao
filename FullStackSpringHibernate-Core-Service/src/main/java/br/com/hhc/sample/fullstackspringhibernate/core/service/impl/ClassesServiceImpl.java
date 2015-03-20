package br.com.hhc.sample.fullstackspringhibernate.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.hhc.sample.fullstackspringhibernate.core.service.ClassesService;
import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.ClassesDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Classes;

@Service
@Transactional
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	private ClassesDAO classesDao;

	public List<Classes> getAll() {
		return classesDao.findAll();
	}

}
