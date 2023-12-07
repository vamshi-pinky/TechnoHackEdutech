package calculator;

import java.util.Scanner;

public class SimpleCalculator 
{
	public static void main(String[] args) {
		System.out.println("Enter 1 to perform Addition..");
		System.out.println("Enter 2 to perform Substration..");
		System.out.println("Enter 3 to perform Multiplication..");
		System.out.println("Enter 4 to perform Division..");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number to choose operation...?");
		int num=sc.nextInt();
		System.out.println("Enter first number ");
		double num1=sc.nextInt();
		System.out.println("Enter second number ");
		double num2=sc.nextInt();
		switch(num)
		{
			case 1:System.out.println("Addition is: "+(num1+num2));break;
			case 2:System.out.println("Substration is: "+(num1-num2));break;
			case 3:System.out.println("Multiplication is: "+(num1*num2));break;
			case 4:System.out.println("Division is: "+(num1/num2));break;
			default:System.err.println("Enter Valid number by reading the instructions....");
		}
	}
}
