package br.com.hhc.sample.fullstackspringhibernate.core.service;

import java.util.List;

import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Classes;


public interface ClassesService {
	List<Classes> getAll();
}
