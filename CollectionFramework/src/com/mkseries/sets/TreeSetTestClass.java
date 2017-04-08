package com.mkseries.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.mkseries.list.Country;

public class TreeSetTestClass {

	public static void main(String[] args) {
		
		TreeSet<String>strings=new TreeSet<String>();
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
		strings.floor(new String("Pola"));
		strings.ceiling(new String("Pola"));
		strings.first();
		strings.last();
		
		
		
		TreeSet<Integer>integers=new TreeSet<Integer>();
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
		
		integers.remove(new Integer(1000));    
		integers.floor(new Integer(90000));
		integers.ceiling(new Integer(90000));
		integers.first();
		integers.last();
		
		TreeSet<Country>countries=new TreeSet<Country>();
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
		
		
		
		
			countries.remove(new Country("India",4000000));    
			countries.floor(new Country("Bangladesh",5000000));	
			countries.ceiling(new Country("Bangladesh",5000000));	
		
			countries.first();
			countries.last();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
