package br.com.hhc.sample.fullstackspringhibernate.database.data.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.hhc.sample.fullstackspringhibernate.database.data.dao.StudentsDAO;
import br.com.hhc.sample.fullstackspringhibernate.database.data.domain.Student;

@Repository 
public class StudentDAOImpl extends BaseDAOImpl<Student, Integer> implements StudentsDAO {
	
}


/* custom
public List<Student> getListToCheckStatusNotExpired(List<Character> statuses, Integer checkStatusMinAgeOfEvent, Integer maxRowCount, String[] sortFieldList ) {
	final Filter filterWaiting = new Filter();
	filterWaiting.setProperty("status");
	filterWaiting.setValue(statuses); 
	filterWaiting.setOperator(Filter.OP_IN);

	final Calendar currentDateTime = Calendar.getInstance();
	
	final Filter filterByRetryValidate = new Filter();
	filterByRetryValidate.setProperty("expirationDate");
	filterByRetryValidate.setValue(currentDateTime.getTime()); // RETRY
	filterByRetryValidate.setOperator(Filter.OP_GREATER_OR_EQUAL);

	final Calendar updateDate = Calendar.getInstance();
	updateDate.add(Calendar.SECOND, checkStatusMinAgeOfEvent);
	final Filter filterByLastStatus = new Filter();
	filterByLastStatus.setProperty("updateDate");
	filterByLastStatus.setValue(updateDate.getTime()); 
	filterByLastStatus.setOperator(Filter.OP_LESS_OR_EQUAL);
	
	final Search search = new Search();
	search.addFilterAnd(filterWaiting, filterByRetryValidate, filterByLastStatus);
	for (String  sortField : sortFieldList) {
		search.addSort(sortField, false);
	}
	
	search.setMaxResults(maxRowCount);		
	
	return this.search(search);
}

public List<Student> getDeliveryListByStatusNotExpired(List<Character> statuses, Integer maxRowCount, String[] sortFieldList, boolean[] sortFieldListDesc) {
	

	final Filter filterStatus = new Filter();
	filterStatus.setProperty("status");
	filterStatus.setValue(statuses);
	filterStatus.setOperator(Filter.OP_IN);

	final Calendar currentDateTime = Calendar.getInstance();

	final Filter filterByScheduleDate = new Filter();
	filterByScheduleDate.setProperty("notDeliveryBeforeDate");
	filterByScheduleDate.setValue(currentDateTime.getTime());
	filterByScheduleDate.setOperator(Filter.OP_LESS_OR_EQUAL);

	final Filter filterByRetryValidate = new Filter();
	filterByRetryValidate.setProperty("expirationDate");
	filterByRetryValidate.setValue(currentDateTime.getTime());
	filterByRetryValidate.setOperator(Filter.OP_GREATER_OR_EQUAL);

	final Search search = new Search();
	search.addFilterAnd(filterStatus, filterByRetryValidate, filterByScheduleDate);
	int idx = 0;
	for (String  sortField : sortFieldList) {
		search.addSort(sortField, sortFieldListDesc[idx]);
		idx++;
	}
	search.setMaxResults(maxRowCount);
	
	return this.search(search);
}

public Student getBySystemAndId(Long id, Long systemId ) {
	Filter filterId = new Filter();
	filterId.setProperty("commId");
	filterId.setValue(id);
	filterId.setOperator(Filter.OP_EQUAL);

	Filter filterSystemId = new Filter();
	filterSystemId.setProperty("codSistema");
	filterSystemId.setValue(systemId);
	filterSystemId.setOperator(Filter.OP_EQUAL);

	Search search = new Search();
	search.addFilterAnd(filterId, filterSystemId);
	
	return this.searchUnique(search);
}


*/