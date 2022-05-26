package com.example.demo.app.employee;

import javax.validation.constraints.NotNull;

public class EmployeeForm {
	
	@NotNull
	private String code;
	
	@NotNull
	private String name;
	
	@NotNull
	private String password;
	
	@NotNull
	private int role;
	
	private boolean newEmployee;

	public EmployeeForm() {
	}

	public EmployeeForm(String code, String name, String password, int role, boolean newEmployee) {
		this.code = code;
		this.name = name;
		this.password = password;
		this.role = role;
		this.newEmployee = newEmployee;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public boolean getNewEmployee() {
		return newEmployee;
	}

	public void setNewEmployee(boolean newEmployee) {
		this.newEmployee = newEmployee;
	}
	

}
