package com.mkseries.sets;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import com.mkseries.list.Country;

public class HashSetTestClass {

	public static void main(String[] args) {
		//We only Store Keys
		//HashSet doesn't Use Comparator interface rather it uses equals method
		//HashSet Doesn't allow duplicate set. It will over override the new element by replacing the old one
		HashSet<String>strings=new HashSet<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Prianka"));
		strings.add(new String("Prianka"));
		strings.add(new String("Prete"));
		strings.add(new String("Pola"));
		
		System.out.println("***********Displaying Using Iteretor*******************");
		Iterator<String>stingItr=strings.iterator();   //no specific order maintained
		while(stingItr.hasNext()){
			String string=stingItr.next();
			System.out.println(string.toString());
			
		}
		
		
		strings.remove(new String("Prete"));    //Search operation is fast
		strings.contains(new String("Pola"));
		
		
		
		HashSet<Integer>integers=new HashSet<Integer>();
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
		
		
		
		HashSet<Country>countries=new HashSet<Country>();
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
