package com.mkseries.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkListTestClass {

	public static void main(String[] args) {
		
	
		//SLL=
		//DLL=
		
		
		LinkedList<String>strings=new LinkedList<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Prianka"));
		strings.add(new String("Prete"));
		strings.add(new String("Pola"));
		
		Iterator<String>stingItr=strings.iterator();
		while(stingItr.hasNext()){
			String string=stingItr.next();
			System.out.println(string.toString());
			
		}
		
		Collections.sort(strings);
		
		Iterator<String>stingItr1=strings.iterator();
		while(stingItr1.hasNext()){
			String string=stingItr1.next();
			System.out.println(string.toString());
			
		}
		
		strings.remove(2);   //very fast compare to Arraylist as arrylist requires shifting
		strings.remove(new String("Ankush"));
		String a1=strings.get(1); //very slow compare to Arrylist, arrylist we know actually where element is stored

//*****************Integer LinkedList**********************************************************************************
		
		LinkedList<Integer>integers=new LinkedList<Integer>();
		integers.add(new Integer(55555));
		integers.add(new Integer(300));
		integers.add(new Integer(1000));
		integers.add(new Integer(90000));
		
		//integers.remove(new Integer(1)); //remove(0)
		Iterator<Integer>integerItr=integers.iterator();
		while(integerItr.hasNext()){
			
			Integer integer=integerItr.next();
			
			System.out.println(integer.intValue());
			
		}
		
		
		
    Collections.sort(integers);
		
		Iterator<Integer>integerItr1=integers.iterator();
		while(integerItr1.hasNext()){
			Integer integer=integerItr1.next();
			System.out.println(integer.intValue());
			
		}
		
		integers.remove(2);   
		Integer i1=integers.get(1);	
		
		
		// *************************Example of User defined LinkedList******************************************** 
		
		
		        LinkedList<Country>countries=new LinkedList<Country>();
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
				
		
				Collections.sort(countries);
				
				Iterator<Country>countryItr1=countries.iterator();
				while(countryItr1.hasNext()){
					Country country=countryItr1.next();
					System.out.println(country.name);
					
				}
				
				countries.remove(2);   
				Country cn=countries.get(1);	
		
		

	}

}
