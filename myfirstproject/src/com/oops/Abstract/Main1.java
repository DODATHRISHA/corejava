package com.oops.Abstract;

public class Main1 implements Printable, Showable {

	public static void main(String[] args) {

	}

	@Override
	public void Show() {
		System.out.println("Showable");
	}

	@Override
	public void print() {
		System.out.println("Printable");

	}

}
