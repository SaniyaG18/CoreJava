package com.edubridge.loopStatements;
//While Loop
import java.util.Scanner;

public class WhileLoopStatement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n<=10) {
			System.out.print(n +" ");
			n++;
		}

	}

}
