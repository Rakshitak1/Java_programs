package Control_Statements;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 3 numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a>b && a>c)
			{
				System.out.println("Given number " + a + " is largest");
			}
			else if(b>a && b>c) 
			{
				System.out.println("Given number " + b + " is largest");
			}
			else
			{
				System.out.println("Given number " + c + " is largest");
			}
		}
	}
}
