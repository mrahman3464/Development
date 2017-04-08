
public class SumOfFirstN implements Runnable{

	//Implementing Runable interface
	
	public void run(){
		this.sumFirstN();
	}
	
	
	
	
	public void sumFirstN(){
		long start=System.currentTimeMillis();
		long sum=0;
		for(long i=0;i<=2000000001;i++){
			sum=sum+i;
		}
		
		long end=System.currentTimeMillis();
		long difference=end-start;
		System.out.println("Time Taken for Sum: "+ difference/1000);
		System.out.println("Sum of First N Natural Number: "+ sum);
		System.out.println("SumOfFirstN Thread is Done---Its going to Exit:  "+Thread.currentThread().getName());
	}
	
	
}
