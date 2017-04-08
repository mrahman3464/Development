package First;

public class Test {
	
	
	public static void main(String[]args){
		
		int number1=Integer.parseInt(args[0]);
     	int number2=Integer.parseInt(args[1]);
		int number3=Integer.parseInt(args[2]);
		int number4=Integer.parseInt(args[3]);
		int number5=Integer.parseInt(args[4]);
		
		Addition addition =new Addition();
 	    int add_three_numer=addition.add(number1, number2, number3);
		System.out.println(add_three_numer);
		
		int add_five_numer=addition.add(number1, number2, number3, number4, number5);
		System.out.println(add_five_numer);
		
		int add_three=addition.add(3, 5, 5);
		System.out.println("Addition of Two Number: "+add_three);
		
		int add_five=addition.add(4, 4, 5, 5, 7);
		System.out.println("Addition of Five Number: "+add_five);
		
		
		Multiplication multiplication =new Multiplication();
		
		int multow=multiplication.mul(5, 5);
		System.out.println("Multiplication of Two Number: "+multow);
		
		int multhree=multiplication.mul(5, 5,5);
		System.out.println("Multiplication of Three Number: "+multhree);
		
		int mulfour=multiplication.mul(5,5,5,5);
		System.out.println("Multiplication of Four Number: "+mulfour);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
