package java_examples;

import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter the operatore('+','-','/','*','%')");
		char operator = scan.next().charAt(0);
		System.out.println("enter the two numbers ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		double output=0;
		switch (operator) {
		case '+':
			output= a+b;
			break;
		case '-':
			output= a-b;
			break;
		case '*':
			output= a*b;
			break;
		case '/':
			output= a/b;
			break;
		case '%':
			output= a%b;
			break;
		
		default:
			System.out.println("can't perform the operation");
			break;
		}
		System.out.println("your answer is for "+a+operator+b+""+output);
	}

}
