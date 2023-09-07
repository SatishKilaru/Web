package com.reshma;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "reshma_emp")
@Entity
public class Employee {

	@Id
	int empno;
	int dept_no;
	String ename;
	String job;
	double sal;

	public Employee() {

	}

	public Employee(int empno, int deptno, String ename, String job, double sal) {
		this.empno = empno;
		this.dept_no = deptno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getDeptno() {
		return dept_no;
	}

	public void setDeptno(int deptno) {
		this.dept_no = deptno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
