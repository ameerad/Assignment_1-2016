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
		while(operand != '+' && operand != '-' && operand != '*' && operand != '/')
		{
			System.out.print("ERROR: Input \'" + operand + "\' was not accepted operand. Please input operand (+, -, *, /): ");
			operand = read.next().charAt(0);
		}
		switch(operand)
		{
		case '+':
			System.out.print("Operand selected. Please input first term of calculation (0-99): ");
			break;
		case '-':
			System.out.print("Operand selected. Please input first term of calculation (0-99): ");
			break;
		case '*':
			System.out.print("Operand selected. Please input first factor of calculation (0-99): ");
			break;
		case '/':
			System.out.print("Operand selected. Please input dividend (0-99): ");
			break;
		}
		while(!read.hasNextInt())
		{
			String temp = read.nextLine();
			switch(operand)
			{
			case '+':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input first term of calculation (0-99): ");
				break;
			case '-':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input first term of calculation (0-99): ");
				break;
			case '*':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input first factor of calculation (0-99): ");
				break;
			case '/':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input dividend (0-99): ");
				break;
			}
		}
		firstnum = read.nextInt();
		
		
		
		
		
		switch(operand)
		{
		case '+':
			System.out.print("First term selected. Please input second term of calculation (0-99): ");
			break;
		case '-':
			System.out.print("First term selected. Please input second term of calculation (0-99): ");
			break;
		case '*':
			System.out.print("First factor selected. Please input second factor of calculation (0-99): ");
			break;
		case '/':
			System.out.print("Dividend selected. Please input divisor (0-99): ");
			break;
		}
		while(!read.hasNextInt())
		{
			String temp = read.nextLine();
			switch(operand)
			{
			case '+':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input second term of calculation (0-99): ");
				break;
			case '-':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input second term of calculation (0-99): ");
				break;
			case '*':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input second factor of calculation (0-99): ");
				break;
			case '/':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input divisor (0-99): ");
				break;
			}
		}
		secondnum = read.nextInt();
		
		System.out.println("Normal calculation: " + firstnum + " " + operand + " " + secondnum);
		
		
		
		
		
		//I am a happy face :)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Leo's part of code	|
		//						V
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}