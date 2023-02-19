//Implement arithmetic calculator using class and object concepts in Java
//Use constructor and take input from user

import java.util.Scanner; //Class to parse input primitive and string types

class Calculator
{
	int num1;
	int num2;
	
	public void setData(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	
	public int add()
	{
		return (num1 + num2);
	}
	
	public int sub()
	{
		return (num1 - num2);
	}
	public int mul()
	{
		return (num1 * num2);
	}
	
	public int div()
	{
		return (num1 / num2);
	}
}

public class CalculatorDemo {
	

	public static void main(String[] args) {
		
		Calculator c1 =new Calculator();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a= sc.nextInt();
		
		System.out.print("Enter second number : ");
		int b= sc.nextInt();
		
		c1.setData(a, b);
		System.out.println("Addition = " + c1.add());
		
		System.out.println("Subraction = " + c1.sub());
		
		System.out.println("Multiplication = " + c1.mul());
		
		System.out.println("Division = " + c1.div());
		
		sc.close();

	}

}
