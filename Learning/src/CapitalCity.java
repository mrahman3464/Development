import java.util.ArrayList;

public class CapitalCity {

	// boolean countryName = countryName.equalsIgnoreCase(countryName);

	public void printCapitalCityOfACountry(String countryName) {

		if (countryName.equalsIgnoreCase("india")) {
			System.out.println("New Dehli is the capital of India");
		}
		else if (countryName.equalsIgnoreCase("Bangladesh")) {
			System.out.println("Dhaka is the capital of Bangladesh");
		}
		else if ((countryName.equalsIgnoreCase("USA"))
				|| (countryName.equalsIgnoreCase("America"))
				|| (countryName.equalsIgnoreCase("United State"))) {
			System.out.println("Washington DC is the capital of USA");
		}

		else if ((countryName.equalsIgnoreCase("Russia"))
				|| (countryName.equalsIgnoreCase("USSR"))) {
			System.out.println("Moscow is the capital of USSR or Russia");
		}

		else if ((countryName.equalsIgnoreCase("UK"))
				|| (countryName.equalsIgnoreCase("britain"))
				|| (countryName.equalsIgnoreCase("Great Britain"))
				|| (countryName.equalsIgnoreCase("United Kingdom"))) {
			System.out.println("London is the capital of UK");
		}

		else if (countryName.equalsIgnoreCase("France")) {
			System.out.println("Paris is the capital of France");
		}

		else if (countryName.equalsIgnoreCase("Australia")) {
			System.out.println("Sydne is the capital of Australia");
		}

		else if (countryName.equalsIgnoreCase("Canada")) {
			System.out.println("Torento is the capital of Canada");
		}
		else if (countryName.equalsIgnoreCase("Germany")) {
			System.out.println("Berlin is the capital of Germany");
		} else {
			System.out.println("Sorry Country Name You entered Doesn't exist. Please Type a Valid Country Name");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
