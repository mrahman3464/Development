import java.util.Scanner;


public class Earth {

	
	public static void main(String[]args){
		
		HumanBeing james =new HumanBeing();
		james.eat();
		james.hairClolor="Black";
		james.height=5;
		james.weight=80;
		HumanBeing bond =new HumanBeing();
		bond.hairClolor="White";
		bond.height=6;
		bond.weight=150;
		bond.sing();
		HumanBeing singer =new HumanBeing();
		singer.printLyrics("Summer of 69");
		String returnLyrics=singer.getLyrics("Billie Jean");
		
		System.out.println(returnLyrics);
		
		practice1pacage.HumanBeing micheal =new practice1pacage.HumanBeing();
		micheal.hairClolor="White";
		micheal.height=6;
		micheal.weight=150;
		micheal.sing();
		HumanBeing play =new HumanBeing();
		play.playMusic("It's My Life");
		play.additionOfTwoNumber(2, 4);
		play.additionOfThreeNumber(2,3,4);
		
		HumanBeing obj =new HumanBeing();
		obj.sex="Male";
		obj.nativeLanguage="Hindi";
		obj.walk();
		obj.talk();
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Name of the Country : ");
		String country=scanner.next();
		
		
		//Following Method Call will Print out will print out the Capital city of a County based on the User Input
		
		CapitalCity capital =new CapitalCity();
		capital.printCapitalCityOfACountry(country);
		
		
		
		
	}
}
