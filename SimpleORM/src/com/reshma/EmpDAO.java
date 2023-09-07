package com.reshma;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class EmpDAO {
	@PersistenceContext
	EntityManager em;

	public List<Employee> getAllEmp() {
		return em.createQuery("SELECT e FROM Employee e").getResultList();
	}

	public Employee del(int eno) {
		return null;
	}
}
