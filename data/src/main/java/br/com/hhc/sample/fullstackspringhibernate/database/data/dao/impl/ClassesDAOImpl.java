package br.com.hhc.sample.fullstackspringhibernate.database.data.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.ClassesDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Classes;

@Repository
public class ClassesDAOImpl extends BaseDAOImpl<Classes, Integer> implements ClassesDAO {
	
}


