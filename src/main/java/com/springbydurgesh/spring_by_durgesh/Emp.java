package com.springbydurgesh.spring_by_durgesh;

public class Emp {
	private int empId;
	private String empName;
	private String empAddress;
	private double empSalary;
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Emp(int empId, String empName, String empAddress, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		System.out.println("setting emp id");
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}
	
	
	
}
