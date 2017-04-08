package Pages;

import java.util.Random;

public class RandomEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(100);
		 
		String app_email="app_email" + randomInt +"@gmail.com";
		 System.out.println(app_email);
		
		
	}

}
