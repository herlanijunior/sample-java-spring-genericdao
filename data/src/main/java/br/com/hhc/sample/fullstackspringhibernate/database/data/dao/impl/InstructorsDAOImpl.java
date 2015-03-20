package br.com.hhc.sample.fullstackspringhibernate.database.data.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.InstructorsDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Instructor;

@Repository 
public class InstructorsDAOImpl extends BaseDAOImpl<Instructor, Integer> implements InstructorsDAO {
	
}


