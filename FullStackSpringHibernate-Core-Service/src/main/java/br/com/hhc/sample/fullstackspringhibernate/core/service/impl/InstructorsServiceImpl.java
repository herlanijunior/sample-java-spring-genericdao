package br.com.hhc.sample.fullstackspringhibernate.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.hhc.sample.fullstackspringhibernate.core.service.InstructorsService;
import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.InstructorsDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Instructor;

@Service
@Transactional
public class InstructorsServiceImpl implements InstructorsService {

	@Autowired
	private InstructorsDAO instructorsDAO;

	public List<Instructor> getAll() {
		return instructorsDAO.findAll();
	}

}
