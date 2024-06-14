package com.gvacharya.accessmodifiers.demo;

public class Child extends Parent {
	public void childDisplay() {
		System.out.println("Display child");
		
		Parent parent = new Parent();
		parent.display();
	}

}
