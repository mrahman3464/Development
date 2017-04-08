
public class TestClass {

	public static void main(String[] args) {
		
		String key1=new String("Ankush");
		
		
		SumOfFirstN s1=new SumOfFirstN(key1);
		//s1.sumFirstN();
		s1.start();   //Start method is present in Thread Class and start method is going to call run() method and run method will call sumFirstN() method
		
		
		SumOfFirstN s11=new SumOfFirstN(key1);
		s11.start(); 
		
		
		MultiplyOfFirstN m1=new MultiplyOfFirstN(key1);
      // m1.multiplyFirstN();
		m1.start(); //Start method is present in Thread Class and start method is going to call run() method and run method will call multiplyFirstN() method
	    
		MultiplyOfFirstN m11=new MultiplyOfFirstN(key1);
			m11.start();
		
		
		try{
		s1.join();
		m1.join();
		s11.join();
		m11.join();
		}catch(InterruptedException e){
		System.out.println("Something Bad Happened");	
		}
		
	System.out.println("Main Thread is Done---Its going to Exit:  "+ Thread.currentThread().getName());
	}

}
