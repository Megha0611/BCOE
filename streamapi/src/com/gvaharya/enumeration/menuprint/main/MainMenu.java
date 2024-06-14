package com.gvaharya.enumeration.menuprint.main;
import com.gvacharya.enumeration.menuprint.Menu;


public class MainMenu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		switch(menu.printMenu()) {
		
		case 1->System.out.println("add"); 
		case 2->System.out.println("update"); 
		case 3->System.out.println("select"); 
		case 4->System.out.println("select all"); 
		case 5->System.out.println("delete"); 
		case 0->System.out.println("exit"); 
		}	
		
		
	}

}
