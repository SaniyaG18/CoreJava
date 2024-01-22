package com.edubridge.loopStatements;
//Program to print 1 to n and vice versa.
//For Loop
import java.util.Scanner;

public class ForLoopStatement {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//for(int i=1;i<=n;i++)
		for(int i=1;i<=n;n--)
		{
			//System.out.print(i +" ");
			System.out.print(n +" ");
		}

	}

}
