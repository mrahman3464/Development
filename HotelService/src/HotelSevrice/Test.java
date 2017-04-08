package HotelSevrice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int choice = 0;
		
		do {
			System.out.println("Menu");
			System.out.println("press 1 to see availablity ... press 10 to exit");
			Scanner  scanner = new Scanner(System.in);
			
			switch() {
			case 1: 
				break;
			case 2: 
				break;
				
			case 10:
				
			}
			
		}while(choice != 10);
		UserInfo userinfo =new UserInfo();
		userinfo.setAddress("2000 H Street, Jamaica, NY");
      System.out.println(userinfo.getAddress());
	}

}
