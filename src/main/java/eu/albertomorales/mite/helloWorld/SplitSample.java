package eu.albertomorales.mite.helloWorld;

public class SplitSample {

	public static void main(String[] args) {
		SplitSample sample = new SplitSample();
		sample.doIt();
	}

	private void doIt() {
		/*
		 * First line
		 */
		String firstLine = "Terry|Pratchett|writer|1948|2015";
		splitAndPrint(firstLine);
		/*
		 * Second line
		 */
		String secondLine = "Joanne|Rowling|writer|1965|";
		splitAndPrint(secondLine);
	}

	private void splitAndPrint(String content) {
		String[] tokensArray;
		String firstName, familyName, profession, birthDate, dateOfDeath;
		tokensArray = content.split("\\|");
		firstName = tokensArray[0];
		familyName = tokensArray[1];
		profession = tokensArray[2];
		birthDate = tokensArray[3];
		dateOfDeath = tokensArray[4];
		System.out.println("First Name: "+firstName);
		System.out.println("Family Name: "+familyName);
		System.out.println("Profession: "+profession);
		System.out.println("Birth Date: "+birthDate);
		System.out.println("Date of Death: "+dateOfDeath);
	}

}
