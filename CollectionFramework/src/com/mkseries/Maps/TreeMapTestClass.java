package com.mkseries.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.mkseries.list.Country;

public class TreeMapTestClass {

	public static void main(String[] args) {
		
		TreeMap<String,String> map1=new TreeMap<String,String>();
		
		map1.put(new String("Ankush"), new String("Ankush is Java Expert"));
		map1.put(new String("Mark"), new String("Mark is Facebook owner"));
		map1.put(new String("Bill"), new String("Microsoft owner"));
		map1.put(new String("Tom Cruse"), new String("Movie Star"));
		
		
		System.out.println("***********Displaying Using Iteretor*******************");
		Iterator<Entry<String,String>>map1Itr= map1.entrySet().iterator();   
		while(map1Itr.hasNext()){
			Entry<String,String> entry=map1Itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
			
		}
		
		map1.remove(new String("Mark"));
		map1.floorKey(new String("Bill"));  
		map1.ceilingKey(new String("Bill"));
		map1.firstKey();
		map1.lastKey();
		
		
		
		TreeMap<Integer,String> map2=new TreeMap<Integer,String>();
		
	       map2.put(new Integer(1), new String("Ankush is Java Expert"));
	       map2.put(new Integer(2), new String("Mark is Facebook owner"));
	       map2.put(new Integer(3), new String("Microsoft owner"));
	       map2.put(new Integer(4), new String("Movie Star"));
			
			
			System.out.println("***********Displaying Using Iteretor*******************");
			Iterator<Entry<Integer,String>>map2Itr= map2.entrySet().iterator();   
			while(map2Itr.hasNext()){
				Entry<Integer,String> entry=map2Itr.next();
				System.out.println(entry.getKey()+ " "+entry.getValue());
				
			}  
			
			
			map2.remove(new Integer(2));
			map2.floorKey(new Integer(3));  
			map2.ceilingKey(new Integer(3));
			map2.firstKey();
			map2.lastKey();
			
			
			
			TreeMap<Country,String> map3=new TreeMap<Country,String>();
			
			map3.put(new Country("USA",3000000), new String("Noth America"));
			map3.put(new Country("India",4000000), new String("South Asia"));
			map3.put(new Country("Bangladesh",5000000), new String("South Asia"));
			map3.put(new Country("china",6000000), new String("Asia"));
			
			System.out.println("***********Displaying Using Iteretor*******************");
			Iterator<Entry<Country,String>>map3Itr= map3.entrySet().iterator();   
			while(map3Itr.hasNext()){
				Entry<Country,String> entry=map3Itr.next();
				System.out.println(entry.getKey()+ " "+entry.getValue());
				
			}  
			
			//Need equals method to compare things
			map3.remove(new Country("Bangladesh",5000000));
			map3.floorKey(new Country("china",6000000));  
			map3.ceilingKey(new Country("china",6000000));
			map3.firstKey();
			map3.lastKey();
		
		
		
		
		
		
		
		
		
		

	}

}
