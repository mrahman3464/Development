
public class MultiplyOfFirstN extends Thread {
 String key;
 
 public MultiplyOfFirstN(String key){
	 this.key=key;
 }
 
	@Override
	public void run(){
		synchronized (key) {
			this.multiplyFirstN();
		}
		
		
	}
	
	
	public void multiplyFirstN(){
		long start=System.currentTimeMillis();
		
		long multiplication=1;
		for(long k=1;k<=2000000001;k++){
			multiplication=multiplication*k;
		}
		
		long end=System.currentTimeMillis();
		long difference=end-start;
		System.out.println("Time Taken for Multiplication: "+ difference/1000);
		
		
		System.out.println("Multiplication of First N Natural Number: "+ multiplication);
		System.out.println("MultiplyOfFirstN Thread is Done---Its going to Exit:  "+Thread.currentThread().getName());
	}
	
	
	
}
