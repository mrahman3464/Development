package com.mkseries.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackTestClass {

	public static void main(String[] args) {
		
		////Stack is a special type of array
		//Stack is a child class of Vector
		//Stack is Synchronized
		//Increase capacity by 100%
		//*********Stack String Example****************************************************	
		Stack<String>strings=new Stack<String>();
		strings.push(new String("Sherling"));
		strings.push(new String("Hema"));
		strings.push(new String("Rajib"));
		strings.push(new String("Papi"));
		
	//***********Iterating through String Vector *********************************************
		System.out.println("***Displaying Using Iteretor*********");
		Iterator<String>stringItr=strings.iterator();
		
		while(stringItr.hasNext()){
			String string=stringItr.next();
			System.out.println(string.toString());
		}
		
		System.out.println("***************************************************");
		
		
		System.out.println("***Displaying Using Pop*********");
		
		int size=strings.size();
		for(int i=0;i<size;i++){
			System.out.println(strings.pop());
		}
		
		
		//FILO=First In Last Out 
		
		
		
		//*********Stack Integer Example****************************************************	
		Stack<Integer>integers=new Stack<Integer>();
		integers.add(new Integer(5000));
		integers.add(new Integer(200));
		integers.add(new Integer(100000));
		integers.add(new Integer(70000));
		System.out.println("***************************************************");	
//***********Iterating through Integers Vector *********************************************
		System.out.println("***Displaying Using Iteretor*********");
		Iterator<Integer>integerItr=integers.iterator();
		
		while(integerItr.hasNext()){
			Integer integer=integerItr.next();
			System.out.println(integer.intValue());
		}
		
	
   System.out.println("***Displaying Using Pop*********");
		
		int size1=integers.size();
		for(int i=0;i<size1;i++){
			System.out.println(integers.pop());
		}
		
		
		
		
		// *************************Example of User defined Stack******************************************** 
		
		
		Stack<Country>countries=new Stack<Country>();
		countries.add(new Country("USA",3000000));
		countries.add(new Country("India",4000000));
		countries.add(new Country("Bangladesh",5000000));
		countries.add(new Country("china",6000000));
		
		
		System.out.println("***Displaying Using Iteretor*********");
		Iterator<Country>countryItr=countries.iterator();
		
		while(countryItr.hasNext()){
			Country country=countryItr.next();
			System.out.println(country.name);
		}
		
		
		 System.out.println("***Displaying Using Pop*********");
			
			int size2=countries.size();
			for(int i=0;i<size2;i++){
				Country cn=(Country)countries.pop();
				System.out.println(cn.name);
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
