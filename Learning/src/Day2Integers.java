//Author:MOKLASUR RAHMAN
//Date: 01/28/2017
public class Day2Integers {
	public static void main(String[]args){
		// Data type:Integer Type 
		int a=30;   //assigning 10 to interger a 
		int b=100;    //assigning 20 to interger a 
		int c=a+b;  // adding int a with b
		int d=b-a;  //Substructing  a from b
		int e=a*b; // Multiplication of a*b
		int f=b/a; //Divide b by a
		int g=b%a;  // Finds the remainder 
		
		System.out.println("Sum of Two Number is :" + c);
		System.out.println("Subtruction of Two Number is :" + d);
		System.out.println("Mutiplication of Two Number is :" + e);
		System.out.println("Division of Two Number is :" + f);
		System.out.println("Modulus or remainder of Two Number is :" + g);
		System.out.println("======String Concatination===============================");	
		//Data Type: String Type
		String a1 ="James";
		String a2="Bond";
		String a3= a1+a2; // Concatination 
		System.out.println(a3);
		System.out.println("======Boolean Type===============================");	
		// Data Type: Boolean Type
		boolean shajib=true;
		System.out.println(shajib);
		boolean compare=(5>6);
		System.out.println(compare);
		System.out.println("======AND(&&)Operator===============================");	
		// && (and) operatior and ==(equal) operator
		boolean i=(2==3)&&(3==3);   
		System.out.println(i);
		boolean j=(2==2)&&(3==3);
		System.out.println(j);
		System.out.println("=================OR(||)/Pipe Operator==============================");
	    boolean k=(1==2)||(3==3);
	    System.out.println(k);
	    boolean m=(1==2)||(3==4);
	    System.out.println(m);
	    
	    System.out.println("============Conditional=======================");	
	  if (1==2){
		  System.out.println("Let's watch Movis"); 
	  }else{
		  System.out.println("Finish your Home work");   
	  }
	    
	  if (2==2){
		  System.out.println("Let's watch Movis");
	  }
	        
	  System.out.println("============for loop=======================");	   
	    
	  
	   for(int n=0;n<10;n++){
		   System.out.println(n);
	   }
	  
	   
	   System.out.println("============while loop=======================");	    
	   int p=1;
	   while(p<10){
		   System.out.println(p);
		   p++;
		   
	   }
	   
	}

}
