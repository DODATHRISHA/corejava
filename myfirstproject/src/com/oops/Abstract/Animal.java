package com.oops.Abstract;

public interface  Animal{
	public static final String ORG_NAME = "Vcube";

	public abstract void sound();

	public abstract void eat();

	public abstract void walk();
	
	//to provide default behaviour & and to avoid backward compatibility we need default method
	//what is backward compatibility'''?
	//if we change anything in interface we must need to change if it is 1000 means we must need to change 1000 classes s the process will conside as backward campaibility
	//to avoid this we use default method in interface
	//stll if we want to provide specific behavior for a particular class yes we can override default methods
	default void sleep() {
		System.out.println("most of the animals sleep time is night's only");
	}

}
