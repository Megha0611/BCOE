package com.ty.mobileapp.presentation;

import java.util.Scanner;

public class MobileUtility {
	private static int top;
	static {
		top=0;
	}
	private 

}
public int printMenu(Scanner scanner) {
	System.out.println("1 add mobil entry");
	System.out.println("2 mobil entry");
	System.out.println("1 add mobil entry");
	System.out.println("1 add mobil entry");
	System.out.println("1 add mobil entry");
	System.out.println("1 add mobil entry");
	System.out.println("1 add mobil entry");
}

public void addMobileEntry(Scanner scanner) {
	if(top< mobiles.length) {
		top++;
	mobiles[top]=new Mobile();
	System.out.println("Enter unidue serial number");
	mobiles[top].setSerialNumber(scanner.nextInt());
	System.out.println("Enter Mobile Brands[samsung|Linovo|]");
	mobiles[top].setBrand(scanner.next());
	System.out.println("Enter Os[samsung|Linovo|]");
	mobiles[top].setBrand(scanner.next());
	}
}

public void updateMobileEntry(Scanner scanner) {
	printAllMobiles();
	System.out.println("Enter serial number to update mobile etry:");
	int serialNumber=scanner.nextInt();
	for(int i=0;i<mobiles.length;i++) 
		if(mobiles[i].getSerialNumber()==serialNumber) {
			System.out.println("Enter new brand");
			mobiles[i].setBrand(scanner.next());
		}
	
	
}
