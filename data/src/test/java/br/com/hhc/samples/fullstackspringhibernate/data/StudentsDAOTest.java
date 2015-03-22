package br.com.hhc.samples.fullstackspringhibernate.data;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.StudentsDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Student;


public class StudentsDAOTest extends AbstractDataTestSuite {
	
	@Autowired
	private StudentsDAO studentDao;

	@Test
	public void listAll(){
		List<Student> list = studentDao.findAll();
		
		for (Student student : list) {
			System.out.print(student.getName());
		}
		Assert.assertNotNull(list);
	}
}
