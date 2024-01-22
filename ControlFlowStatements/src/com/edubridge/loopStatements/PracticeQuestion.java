package com.edubridge.loopStatements;

import java.util.Scanner;

//count no. of digits in the given number
public class PracticeQuestion {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int count=0;
		for(int j=i;j>0;j=j/10)
		{
			count = count+1;
			
		}
		System.out.print(count);
		
		

	}

}
