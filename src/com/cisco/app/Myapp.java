package com.cisco.app;

import java.util.Scanner;

public class Myapp {

 public static void main(String args[]) {
	 
	 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 
	 int cashback[] = {30,40,10,4,60,23,90,45};
	 while (true) {
	 System.out.println("Enter any number ");
	 int lunckynum = sc.nextInt();
	 
	 try {
	
		 int cash = cashback[lunckynum];
		 System.out.println("congratulation you won a cash back of " + cash +"Rs");
		 
		 
	} catch (ArrayIndexOutOfBoundsException e) {
	
		System.out.println("Better luck next time ");
	} 
	 
	 System.out.println("Enter y to exit or press any key to continue");
		String input= sc.next();
		if(input.equals("y") || input.equals("Y")) {
			break;
		}
	 }
	 
 }
	
}
