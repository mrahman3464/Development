package non.premitive.data.type;

import java.util.Date;

public class NoPremitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Integer a1=new Integer(10);      //Integer is a built in class
		System.out.println(a1.intValue());
		
		Long l1=new Long(211);      //Long is a built in class
		System.out.println(l1.longValue());
		
		Float f1=new Float(2.5f);      //Float is a built in class
		System.out.println(f1.floatValue());
		
		Double d1=new Double(2.5d);      //Double is a built in class
		System.out.println(d1.doubleValue());
		
		Byte by1=new Byte((byte)2);      //Byte is a built in class
		System.out.println(by1.byteValue());
		
		Short s1=new Short((short)2);      //Short is a built in class
		System.out.println(s1.shortValue());
		
		Character c1=new Character('Y');      //Character is a built in class
		System.out.println(c1.charValue());
		
		Boolean b1=new Boolean(false);      //boolean is a built in class
		System.out.println(b1.booleanValue());
		
		String st1=new String("Rahman");
		System.out.println(st1.toString());
		
		Date dt=new Date();
		System.out.println(dt.toString());

       Country country=new Country("USA");
       System.out.println(country.name);
		
	}

}
