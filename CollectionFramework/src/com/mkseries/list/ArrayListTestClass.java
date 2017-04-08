package com.mkseries.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTestClass {

	public static void main(String[] args) {
		//ArrayList is a special type of array
		//ArrayList is not Synchronized
		//Increase capacity by 50%
		
		String[] s1=new String[10];
		
		Integer[]i1=new Integer[20];
		
		ArrayList<String>arraylist=new ArrayList<String>();
		arraylist.add(new String("Ankush"));
		arraylist.add(new String("Prianka"));
		arraylist.add(new String("Prete"));
		arraylist.add(new String("Pola"));
		
		Iterator<String>stingItr=arraylist.iterator();
		while(stingItr.hasNext()){
			String a=stingItr.next();
			System.out.println(a.toString());
			
		}
		
	String a1=arraylist.get(2);
	System.out.println("**************Second Eelement Before Delet****************************");
	System.out.println(a1.toString());
	arraylist.remove(2);
	String a2=arraylist.get(2);
	System.out.println("**************After Delet****************************");
	System.out.println(a2.toString());
	System.out.println("******************************************");
		
	
	Collections.sort(arraylist);
	
	
		ArrayList<Integer>arrayInteger=new ArrayList<Integer>();
		arrayInteger.add(new Integer(10));
		arrayInteger.add(new Integer(100));
		arrayInteger.add(new Integer(1000));
		arrayInteger.add(new Integer(10000));
		
		Iterator<Integer>integerItr=arrayInteger.iterator();
		while(integerItr.hasNext()){
			
			Integer a=integerItr.next();
			
			System.out.println(a.toString());
			
		}
		
		arrayInteger.remove(2);
		arrayInteger.get(2);
		Collections.sort(arrayInteger);
		
		
		
		
		
		System.out.println("******************************************");
		ArrayList<Country>arrayCountry=new ArrayList<Country>();
        arrayCountry.add(new Country(3000000,"USA"));
		arrayCountry.add(new Country(4000000,"India"));
		arrayCountry.add(new Country(5000000,"Bangladesh"));
		arrayCountry.add(new Country(6000000,"china"));
		
		
		//System.out.println(arrayCountry);
		
		//Collections.sort(arrayCountry, new PopulationComparator()); //Sort by Population
		Collections.sort(arrayCountry, new NameComparator()); //Sort By Country name
		Iterator<Country>countryItr=arrayCountry.iterator();
		while(countryItr.hasNext()){
			Country cn=countryItr.next();
			System.out.println(cn.name+ " "+ cn.population);
			
		}
		
//		arrayCountry.get(3);
//		arrayCountry.remove(2);
		
		
	}

}
