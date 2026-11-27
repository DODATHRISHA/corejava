package com.oops.Abstract;

public class TestAnima {

	public static void main(String[] args) {
		System.out.println("welcome");
		
		System.out.println("cat info");
		Cat c = new Cat();
		c.sound();
		c.eat();
		c.walk();
		c.sleep();

		System.out.println("dog info");
		Dog d = new Dog();
		d.sound();
		d.eat();
		d.walk();
		d.sleep();
		
		System.out.println("monkey infooo");
		Monkey m = new Monkey();
		m.eat();
		m.walk();
		m.sound();
		m.sleep();
	}

}
