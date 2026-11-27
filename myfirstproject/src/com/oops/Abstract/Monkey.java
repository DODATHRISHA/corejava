package com.oops.Abstract;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("kichhhh");

	}

	@Override
	public void eat() {
		System.out.println("banana");
	}

	@Override
	public void walk() {
		System.out.println("jump");
	}

}
