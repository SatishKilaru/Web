package com.reshma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Service {
	@Autowired
	EmpDAO ed;

	@Transactional(readOnly = true)
	public List<Employee> listAll() {
		return ed.getAllEmp();

	}

	@Transactional(readOnly = true)
	public Employee listAll(String click, String id) {
		int eno = Integer.parseInt(id);
		if ("edit".equals(click)) {
			return null;
		} else if ("del".equals(click)) {
			return ed.del(eno);
		}
		return null;
	}
}
