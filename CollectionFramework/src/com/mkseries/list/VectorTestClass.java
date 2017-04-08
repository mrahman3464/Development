package com.mkseries.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTestClass {

	public static void main(String[] args) {
		//Vector is a special type of array
		//Vector is Synchronized
		//Increase capacity by 100%
		//*********Vector String Example****************************************************	
				Vector<String>strings=new Vector<String>();
				strings.add(new String("Sherling"));
				strings.add(new String("Hema"));
				strings.add(new String("Rajib"));
				strings.add(new String("Papi"));
				
			//***********Iterating through String Vector *********************************************
				Iterator<String>stringItr=strings.iterator();
				
				while(stringItr.hasNext()){
					String string=stringItr.next();
					System.out.println(string.toString());
				}
				
				System.out.println("***************************************************");
				
				Collections.sort(strings);  //insertion order is dismissed and rearranged in an ascending order
				
				
				Iterator<String>stringItr1=strings.iterator();
				
				while(stringItr1.hasNext()){
					String string=stringItr1.next();
					System.out.println(string.toString());
				}
				
				
				strings.remove(2);            //Removes Element at index 2
				String a1=strings.get(1);     //get element at index 1
				
				
//*********Vector Integer Example****************************************************	
						Vector<Integer>integers=new Vector<Integer>();
						integers.add(new Integer(5000));
						integers.add(new Integer(200));
						integers.add(new Integer(100000));
						integers.add(new Integer(70000));
						System.out.println("***************************************************");	
//***********Iterating through Integers Vector *********************************************
						Iterator<Integer>integerItr=integers.iterator();
						
						while(integerItr.hasNext()){
							Integer integer=integerItr.next();
							System.out.println(integer.toString());
						}
						
		     
						Collections.sort(integers); //rearrange in an ascending Order
						
						System.out.println("***************************************************");	
						Iterator<Integer>integerItr1=integers.iterator();
						
						while(integerItr1.hasNext()){
							Integer integer=integerItr1.next();
							System.out.println(integer.intValue());
						}
						
						
						integers.remove(2);            //Removes Element at index 2
						Integer i1=integers.get(1);     //get element at index 1
				
						
						
						
// *************************Example of User defined Vector******************************************** 
				
					
						Vector<Country>countries=new Vector<Country>();
						countries.add(new Country("USA",3000000));
						countries.add(new Country("India",4000000));
						countries.add(new Country("Bangladesh",5000000));
						countries.add(new Country("china",6000000));
						
						
//***********Iterating through Country Vector *********************************************	
						Iterator<Country>countryItr=countries.iterator();
						while(countryItr.hasNext()){
							//Country cn=countryItr.next();
							//System.out.println(cn.name+ " "+ cn.population);
							
							Country country=countryItr.next();
							System.out.println(country.name);
							
						}
		
		         Collections.sort(countries); 
			//Collection.sort(countries, new NameComparator();
			//Collection.sort(countries, new PopulationComparator();
		         
		         
		Iterator<Country>countryItr1=countries.iterator();
		while(countryItr1.hasNext()){
			Country country=countryItr1.next();
			System.out.println(country.name);
			
		}

		
		countries.remove(2);
		Country cn=countries.get(1);
		
		
		
		
	}

}
