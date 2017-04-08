package com.mkseries.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.mkseries.list.Country;

public class LinkedHashSetTestClass {

	public static void main(String[] args) {
		
		LinkedHashSet<String>strings=new LinkedHashSet<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Prianka"));
		strings.add(new String("Prianka"));
		strings.add(new String("Prete"));
		strings.add(new String("Pola"));
		
		System.out.println("***********Displaying Using Iteretor*******************");
		Iterator<String>stingItr=strings.iterator();   //insertion  order maintained
		while(stingItr.hasNext()){
			String string=stingItr.next();
			System.out.println(string.toString());
			
		}
		
		
		strings.remove(new String("Prete"));   
		strings.contains(new String("Pola"));
		
		
		
		
		
		
		LinkedHashSet<Integer>integers=new LinkedHashSet<Integer>();
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
		
		integers.remove(new Integer(1000));    //Search operation is fast
		integers.contains(new Integer(90000));	
		
		
		
		LinkedHashSet<Country>countries=new LinkedHashSet<Country>();
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
		
		
		
		
			countries.remove(new Country("India",4000000));    //it will remove Country Object with a value India and 4000000 
			                                                   //if hashCode and equal methods are Overridden in Country Class
			countries.contains(new Country("Bangladesh",5000000));	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
