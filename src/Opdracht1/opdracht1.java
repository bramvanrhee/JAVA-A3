package Opdracht1;

public class opdracht1 {
	public static void main(String[] args) {
		persoon persoon1 = new persoon();
		
		//Setters
		persoon1.setVoornaam("Bram");
		persoon1.setAchternaam("van Rhee");
		persoon1.setGeboortedatum("2001-12-21");
		
		//Print of Getters
		System.out.println(persoon1.getVoornaam());
		System.out.println(persoon1.getAchternaam());
		System.out.println(persoon1.DaysAge(persoon1.getGeboortedatum()));
	}
}
