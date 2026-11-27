package com.oops.Abstract;

public class Dog implements Animal {
	
	@Override
	public void sleep() {
		System.out.println("dogs won't sleep at night's & helps villages or city or streets");
		
	}

	@Override
	public void sound() {
		System.out.println("dog make sound bow");
	}

	@Override
	public void eat() {
		System.out.println("dog can eat food");
	}

	@Override
	public void walk() {
		System.out.println("dog can run like lion");

	}

}
