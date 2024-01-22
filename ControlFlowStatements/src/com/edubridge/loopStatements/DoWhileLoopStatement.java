package com.edubridge.loopStatements;
//Do-While Loop
import java.util.Scanner;

public class DoWhileLoopStatement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		do{
			System.out.print(n +" ");
			n++;
		}while(n<=20);
	}

}
