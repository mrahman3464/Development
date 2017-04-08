package com.mkseries.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import com.mkseries.list.Country;

public class PriorityQueueTestClass {

	public static void main(String[] args) {
		
		
		PriorityQueue<String>strings=new PriorityQueue<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Prianka"));
		strings.add(new String("Prete"));
		strings.add(new String("Pola"));
		
		System.out.println("***********Displaying Using Iteretor*******************");
		Iterator<String>stingItr=strings.iterator();   //no specific order maintained
		while(stingItr.hasNext()){
			String string=stingItr.next();
			System.out.println(string.toString());
			
		}
		
		System.out.println("***********Displaying Using poll*******************");
		
		int size=strings.size();
		for(int i=0;i<size;i++){
			System.out.println(strings.poll());  //returns minimum value
		}
		
		
		
		PriorityQueue<Integer>integers=new PriorityQueue<Integer>();
		integers.add(new Integer(5000));
		integers.add(new Integer(200));
		integers.add(new Integer(100000));
		integers.add(new Integer(70000));
		System.out.println("***************************************************");	
//***********Iterating through Integers PriorityQueue *********************************************
		System.out.println("***Displaying Using Iteretor*********");
		Iterator<Integer>integerItr=integers.iterator();
		
		while(integerItr.hasNext()){
			Integer integer=integerItr.next();
			System.out.println(integer.intValue());
		}
		
	
   System.out.println("***Displaying Using Poll*********");
		
		int size1=integers.size();
		for(int i=0;i<size1;i++){
			System.out.println(integers.poll());
		}

		
		
		PriorityQueue<Country>countries=new PriorityQueue<Country>();
		countries.add(new Country("USA",300));
		countries.add(new Country("India",400));
		countries.add(new Country("Bangladesh",50));
		countries.add(new Country("china",600));
		
		
		System.out.println("***Displaying Using Iteretor*********");
		Iterator<Country>countryItr=countries.iterator();
		
		while(countryItr.hasNext()){
			Country country=countryItr.next();
			System.out.println(country.name);
		}
		
		
		 System.out.println("***Displaying Using Poll*********");
			
			int size2=countries.size();
			for(int i=0;i<size2;i++){
				Country cn=(Country)countries.poll();
				System.out.println(cn.name);
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
