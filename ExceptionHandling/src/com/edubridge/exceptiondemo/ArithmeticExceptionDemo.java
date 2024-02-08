package com.edubridge.exceptiondemo;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int x = 15;
		System.out.println("Enter y: ");
		try {
			int y = s.nextInt();
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println("Exception Occured "+ e);
		}

	}

}
