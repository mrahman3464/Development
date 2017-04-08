
public class TestClass {

public static void main(String[]args){
	
	try{
		
		//int number =10/0;
		ArithmeticException e =new ArithmeticException();
		throw e;
		
	}catch(ArithmeticException e){
		
	System.out.println("Some exception occured");	
	
	}catch(NullPointerException e){
		
		System.out.println("Some exception occured");
		
	}catch(ArrayIndexOutOfBoundsException e){
		
		System.out.println("ArryIndexOutof Bound exception occured");	
		
	}catch(RuntimeException e){
		
		System.out.println("Runtime  exception occured");	
	}
	
		
	}
	
	
	
	
	
	
	
}



}
