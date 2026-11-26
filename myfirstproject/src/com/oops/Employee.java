package com.oops;

public class Employee {
	private int id;
	private String name;
	private double sal;

	public void setint(int id) {
		this.id = id;
	}

	public int getint() {
		return id;
	}

	public void setString(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setsal(double sal) {
		this.sal = sal;
	}

	public double getsal() {
		return sal;
	}

	public static void main(String[] args) {
		Employee e = new Employee();

		e.setint(101);
		e.setString("trisha");
		e.setsal(500000); 

		System.out.println("the employe id is:" + e.getint());
		System.out.println("the employe id is:" + e.getname());
		System.out.println("the employe id is:" + e.getsal());

	}

}
