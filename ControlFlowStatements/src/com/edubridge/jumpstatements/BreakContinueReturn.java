package com.edubridge.jumpstatements;

import java.util.Scanner;

// Break,Continue, Labeled Break and Return Statements
public class BreakContinueReturn {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			Go_to:
				for(int j=1;j<=a;j++)
				{
					System.out.print(j +" ");
					break Go_to;
					//continue Go_to;
				}
			
			if(i==5)
			{
				continue;
			}
			
			System.out.print(i +" ");
			if(i==7)
			{
				break;
			}
			
			
		}

	}

}
