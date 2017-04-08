package First;

public class Multiplication extends AbstractMultiplication {

	public int mul(int num1, int num2, int num3) {

		int num = num1 * num2 * num3;
		return num;
	}

	public int mul(int num1, int num2) {

		int num = num1 * num2;
		return num;
	}
	
	
	public String getLyrics(String songName){
		String lyrics=null;
		if (songName.equals("Summer of 69")){
			lyrics="I got my first real six-string Bought it at the five-and-dime...";
		}else if (songName.equals("Billie Jeans")){
			lyrics="She was more like a beauty queen from a movie scene...";
		}
		return lyrics;
		}
	
}
