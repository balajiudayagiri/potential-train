package com.maps;

public class Employee {
	int jobId, salary;
	String role,team;
	public Employee(int jobId, int salary, String role, String team) {
		super();
		this.jobId = jobId;
		this.salary = salary;
		this.role = role;
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Employment details : \n\tJobId : "+jobId+"\n\tSalary : "+salary+"\n\tRole : "+role+"\n\tTeam : "+team;
	}
	
	
}
