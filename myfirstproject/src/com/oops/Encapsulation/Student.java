package com.oops.Encapsulation;

public class Student {
	private String name;
	private int age;
	private int marks;

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}

	public void setmarks(int marks) {
		if (marks > 0 && marks <= 100) {
			this.marks = marks;
			System.out.println("your marks is accept");
		} else {
			System.out.println("your marks is not accept");
		}
	}

	public int getmarks() {
		return marks;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setname("trisha");
		s.setage(21);
		s.setmarks(101);

		System.out.println(s.getname());
		System.out.println(s.getage());
		System.out.println(s.getmarks());

	}

}
