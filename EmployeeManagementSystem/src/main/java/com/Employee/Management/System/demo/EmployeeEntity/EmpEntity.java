package com.Employee.Management.System.demo.EmployeeEntity;

public class EmpEntity {


	private int id;
	private String name;
	private String Dept;
	private String role;
	private Long salary;
	public EmpEntity(int id, String name, String Dept,String role,Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.Dept = Dept;
		this.role = role;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String Dept) {
		this.Dept = Dept;
	}
	public String getrole() {
		return role;
	}
	public void setrole(String role) {
		this.role = role;
	}
	public Long getsalary() {
		return salary;
	}
	public void setsalary(Long salary) {
		this.salary = salary;
	}
	
	

}


