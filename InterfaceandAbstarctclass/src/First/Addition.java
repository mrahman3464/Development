package First;

public class Addition implements IAddition{
	
	public int add(int num1,int num2,int num3){
		int num= num1+ num2+ num3;
		return num;
	}

	
	public int add(int num1,int num2,int num3,int num4, int num5){
		int num= num1+ num2+ num3+num4+num5;
		return num;
	}
	
}
