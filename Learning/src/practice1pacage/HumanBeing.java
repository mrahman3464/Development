package practice1pacage;

public class HumanBeing {
	//Class =Document =Blueprint = java program
	public String hairClolor;
	public int height;
	public int weight;
	
	public void eat(){
		System.out.println("I am eating");
	}
	
	public void sing(){
		System.out.println("I am Singing");
	}
	
	
	
	public void printLyrics(String songName){
		
	if (songName.equals("Summer of 69")){
		System.out.println("I got my first real six-string Bought it at the five-and-dime...");
	}else if (songName.equals("Billie Jeans")){
		System.out.println("She was more like a beauty queen from a movie scene...");
	}
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
