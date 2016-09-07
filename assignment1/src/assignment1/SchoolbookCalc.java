package assignment1;
import java.util.Scanner;

public class SchoolbookCalc
{
	public static void main(String[] args)
	{
		//Ameera's part of code |
		//						V
		
		/**
		 * Leo Persson began creating input and errorhandling 2016-09-07 11:48
		 */
		Scanner read = new Scanner(System.in);																						//Declaration of input variables and creation of Scanner
		char operand;
		int firstnum, secondnum;
		
		System.out.print("Welcome to DIT948 Calculator!\nPlease input operand (+, -, *, /): ");										//Welcome message
		operand = read.next().charAt(0);																							//Input string, first character is char used as operand
		while(operand != '+' && operand != '-' && operand != '*' && operand != '/')													//Checking if char operand is actually an operand, if not, returns an error and prompts user to input new value
		{
			System.out.print("ERROR: Input \'" + operand + "\' was not accepted operand. Please input operand (+, -, *, /): ");		//Output error message and prompt userinput
			operand = read.next().charAt(0);																						//Input new userinput
		}
		switch(operand)																												//Switch that checks for operand and makes sure program is using right arithmetic term
		{
		case '+':
			System.out.print("Operand selected. Please input first term of calculation (0-99): ");									//Addition
			break;
		case '-':
			System.out.print("Operand selected. Please input first term of calculation (0-99): ");									//Subtraction
			break;
		case '*':
			System.out.print("Operand selected. Please input first factor of calculation (0-99): ");								//Multiplication
			break;
		case '/':
			System.out.print("Operand selected. Please input dividend (0-99): ");													//Division
			break;
		}
		while(!read.hasNextInt())																									//
		{
			String temp = read.nextLine();
			switch(operand)																											//Switch that checks for operand and makes sure error messages proper arithmetic terms
			{
			case '+':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input first term of calculation (0-99): ");	//Addition
				break;
			case '-':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input first term of calculation (0-99): ");	//Subtraction
				break;
			case '*':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input first factor of calculation (0-99): ");	//Multiplication
				break;
			case '/':
				System.out.print("ERROR: Input \'" + temp +  "\' was not accepted integer. Please input dividend (0-99): ");					//Division
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
		
		/**
		 * Leo Persson finished input and errorhandling 2016-09-07 17:00
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Leo's part of code	|
		//						V
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}