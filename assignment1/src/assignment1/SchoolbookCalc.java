package assignment1;
import java.util.Scanner;

public class SchoolbookCalc
{
	public static void main(String[] args)
	{
		//Ameera's part of code |
		//						V
		Scanner read = new Scanner(System.in);			//I took the liberty of creating a Scanner and input up here :) Leo 2016/09/07 11:48
		char operand;
		int firstnum, secondnum;
		System.out.print("Welcome to DIT948 Calculator!\nPlease input operand (+, -, *, /): ");
		operand = read.next().charAt(0);
		while(operand != '+' || operand != '-' || operand != '*' || operand != '/')
		{
			System.out.print("ERROR: Input was not accepted operand. Please input operand (+, -, *, /): ");
			operand = read.next().charAt(0);
			System.out.println(operand);
		}
		System.out.println(operand);					//Not working for some reason... Leo 2016/09/07 12:02
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Leo's part of code	|
		//						V
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}