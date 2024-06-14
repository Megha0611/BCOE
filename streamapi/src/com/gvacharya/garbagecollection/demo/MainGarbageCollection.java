package com.gvacharya.garbagecollection.demo;

public class MainGarbageCollection {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collection");
	}

	public static void main(String[] args) {
		printStudent();
		System.gc();
	}
	 
	public static void printStudent() {
		Student student1 =new Student();
		System.out.println(student1);
		student1=null;

	}

}
