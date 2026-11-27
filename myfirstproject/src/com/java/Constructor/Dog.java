package com.java.Constructor;

//this & super are the keyword in java
//this is a keyword to invoke current class object data members.
//super is the keyword to invoke parent class object data members.
//this&super we can use in instance methods & constructors but not in static methods.

class Animal{
	int age = 5;
	String breed = "Labrador Retriever" ;
	public static void main(String[]args) {
		System.out.println("main method started animal");
	}
}

public class Dog extends Animal{
	int age = 6;
	String breed = "German Shepherd";

	//cannot use super/this in a static context
	public static void main(String[] args) {
		System.out.println("main method started dog");
		Dog d = new Dog();
		d.dogInfo();

	}
	void dogInfo() {
		System.out.println("age of the dog:"+super.age);
		System.out.println("breed of the dog:"+super.breed);
		
		System.out.println("***************");
		System.out.println("age of the dog:"+this.age);
		System.out.println("breed of the dog:"+this.breed);
	}

}
