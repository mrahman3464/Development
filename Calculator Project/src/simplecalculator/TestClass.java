package simplecalculator;

import java.util.Scanner;

public class TestClass {

	
	public static void main(String[]args){
		//Reference: Day 8 Lesson
		int number7=Integer.parseInt(args[0]);
		int number8=Integer.parseInt(args[1]);
		int number9=Integer.parseInt(args[2]);
		
		Addition obj4 = new Addition();
		int sumofTwoNumberis= obj4.add(number7, number8);
		System.out.println("Sum of two number: " + sumofTwoNumberis);
		
		AdvanceAddition advanceAdditionobj=new AdvanceAddition();
		int sumofthreenumber=advanceAdditionobj.advanceAddition(number7, number8, number9);
		System.out.println("Sum of three number: " + sumofthreenumber);
		
		advanceAdditionobj.add(number7, number8); // Inheritance example
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number1: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter Number2: ");
		int num2=scanner.nextInt();
		
		Addition obj = new Addition();
		int sumofTwoNumber= obj.add(num1, num2);
		System.out.println("Sum of two number: " + sumofTwoNumber);
		
		Subtraction obj2= new Subtraction();
		int subofTwoNumber = obj2.sub(num1, num2);
		System.out.println("Subtraction of two Number: "+ subofTwoNumber);
		
		String[]name={"Ankus", "Jhon", "Sherlin"};
		String a=name[0];
		System.out.println(a);
		
		String name1="12";
		String name2="14";
		String name3=name1+name2;
		System.out.println(name3);
		
		//Parse
		String name4="12";
		int ab =Integer.parseInt(name4);
		String name5="14";
		int bc =Integer.parseInt(name5);
		int ef =ab+bc;
		System.out.println(ef);
		
		int b=30; 
		int c = 100;
		
		Claculator calculate =new Claculator();
		
		int addition=calculate.add(b, c);
		int substruction= calculate.sub(c, b);
		int multiplication =calculate.multiplication(c, b);
		int division= calculate.division(c, b);
		
		System.out.println("Adding two number: " + addition);
		System.out.println("Substracting two number: " + substruction);
		System.out.println("Multiplying  two number: " + multiplication);
		System.out.println("dividing two number: " + division);
		
		
		
		
		
		
		
		
		
		
	}
}
