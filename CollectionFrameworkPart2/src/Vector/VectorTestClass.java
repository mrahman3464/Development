package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTestClass {

	public static void main(String[] args) {
		
	//*********Vector String Example****************************************************	
		Vector<String>strings=new Vector<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Sherling"));
		strings.add(new String("Rajib"));
		strings.add(new String("Papi"));
		
	//***********Iterating through String Vector *********************************************
		Iterator<String>stringItr=strings.iterator();
		
		while(stringItr.hasNext()){
			String string=stringItr.next();
			System.out.println(string.toString());
		}
		
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
				
			//***********Iterating through Integers Vector *********************************************
				Iterator<Integer>integerItr=integers.iterator();
				
				while(integerItr.hasNext()){
					Integer integer=integerItr.next();
					System.out.println(integer.toString());
				}
				
     
				Collections.sort(integers); //rearrange in an ascending Order
				
				
				Iterator<Integer>integerItr1=integers.iterator();
				
				while(integerItr1.hasNext()){
					Integer integer=integerItr1.next();
					System.out.println(integer.toString());
				}
				
				
				integers.remove(2);            //Removes Element at index 2
				Integer i1=integers.get(1);     //get element at index 1
		
				
				
				
	// Example of User defined 
		
		

	}

}
