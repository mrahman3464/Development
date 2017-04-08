package First;

public abstract class AbstractMultiplication {
	
	public abstract int mul(int num1,int num2);
	public abstract int mul(int num1,int num2,int num3);
	//public abstract void printCapitanCityOfACountry();
	public abstract String getLyrics(String songName);
	
	
	public int mul(int num1,int num2,int num3, int num4){
		int num=num1*num2*num3*num4;
		return num;
	}
	

}
