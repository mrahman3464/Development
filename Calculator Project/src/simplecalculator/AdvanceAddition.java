package simplecalculator;

public class AdvanceAddition extends Addition{
	//Inheritance Example: Here we basically extending the Addition class in this class 
	// so that we can use some of the function of Addition class in this class.
	// Another way of saying AdvanceAddition is inheriting all the function and properties of Addition class
	

		public int advanceAddition(int num1, int num2,int num3){
			int num=num1+num2+num3;
			return num;
		}

		
		//Here we have simply overrriden add function
		
		public int add(int num1, int num2){
			int num=num1+num2;
			System.out.println(num);
			return num;
		}
}
