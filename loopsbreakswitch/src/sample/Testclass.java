package sample;

import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {

		int num = 4;
		int i=5;
		int number=6;
		 while(num<7){
		 System.out.println("Printing the Value of num " + num);
		 num++;
		 }

		do {
			System.out.println("=================================");
			System.out.println("Printing the Value of i: " + i);
			System.out.println("=================================");
		} while (i > 7);

		
		switch(number){
		
		case 1: System.out.println("This number is 1");
		break;
		case 2: System.out.println("This number is 2");
		break;
		case 3: System.out.println("This number is 3");
		break;
		case 4: System.out.println("This number is 4");
		break;
		case 5: System.out.println("This number is 5");
		break;
		
		default: System.out.println("This number is doesn't exist");
		break;
		
		
		}
		
//		Scanner carname=new Scanner(System.in);
//       
//		switch(carname){
//		
//		case 1: System.out.println("This number is 1");
//		case 2: System.out.println("This number is 2");
//		case 3: System.out.println("This number is 3");
//		case 4: System.out.println("This number is 4");
//		case 5: System.out.println("This number is 5");
//		
//		default: System.out.println("This number is doesn't exist");
//		
//		
	
	for (int k=1;k<20;k++){
		System.out.println("=================================");
		System.out.println("The value of K is: "+ k);
		System.out.println("=================================");
		break;
	
	}
	
	
		
	for (int j=0;j<10;j++){
		System.out.println("The value of j is: "+j);
		
	
	}	
		
		
	String[]a={"Tanvir","Shaon","Ravin","Jammy"};
	System.out.println("Value of position 1 is: " + a[1]);
	a[1]="Lucy";
	System.out.println("Value of position 1 is: " + a[1]);
		
		
	String[]b={"Samsung","LG","Sonny","Panasonnic"};
	System.out.println("Value of position 4 is: " + b[4]);
//	try{
//	System.out.println("Value of position 4 is: " + b[4]);
//	}catch(ArrayIndexOutOfBoundsException e){
//		System.out.println("Arry out of bounds occured of some problem");
//	}
	System.out.println("Value of position 0 is: " + b[0]);
	System.out.println("Value of position 1 is: " + b[1]);
	System.out.println("Value of position 2 is: " + b[2]);
	System.out.println("Value of position 3 is: " + b[3]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
