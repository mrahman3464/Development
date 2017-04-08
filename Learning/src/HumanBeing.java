public class HumanBeing {
	// Class =Document =Blueprint = java program
	String hairClolor;
	int height;
	int weight;
	String nativeLanguage;
	String sex;

	public void eat() {
		System.out.println("I am eating");
	}

	public void sing() {
		System.out.println("I am Singing");
	}

	public void walk() {
		System.out.println("I am walking");
	}

	public void talk() {
		System.out.println("I am talking");
	}

	public void printLyrics(String songName) {

		if (songName.equals("Summer of 69")) {
			System.out
					.println("I got my first real six-string Bought it at the five-and-dime...");
		} else if (songName.equals("Billie Jeans")) {
			System.out
					.println("She was more like a beauty queen from a movie scene...");
		}
	}

	public void playMusic(String songName) {

		if (songName.equals("Summer of 69")) {
			System.out
					.println("I got my first real six-string Bought it at the five-and-dime...");
		} else if (songName.equals("Billie Jeans")) {
			System.out
					.println("She was more like a beauty queen from a movie scene...");
		} else {
			System.out
					.println("I am not playing this song-as this is not available");
		}
	}

	public String getLyrics(String songName) {
		String lyrics = null;
		if (songName.equals("Summer of 69")) {
			lyrics = "I got my first real six-string Bought it at the five-and-dime...";
		} else if (songName.equals("Billie Jeans")) {
			lyrics = "She was more like a beauty queen from a movie scene...";
		}
		return lyrics;
	}

	public void additionOfTwoNumber(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println("Addition of Two Number is:" + num3);
	}

	public void additionOfThreeNumber(int num1, int num2, int num3) {
		int num4 = num1 + num2 + num3;
		System.out.println("Addition of Two Number is:" + num4);
	}

}
