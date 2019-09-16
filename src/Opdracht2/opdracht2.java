package Opdracht2;

public class opdracht2 {
	public static void main(String[] args) {
		auto auto = new auto();
		
		auto.setMerk("Audi");
		auto.setType("RS7");
		auto.setKleur("mat zwart");
		auto.setGewicht(1895);
		auto.setBelasting(325);
		
		System.out.println("Merk en type: " + auto.getMerk() + " " + auto.getType());
		System.out.println("Kleur: " + auto.getKleur());
		System.out.println("Gewicht: " + auto.getGewicht());
		System.out.println("Wegenbelasting: " + auto.getBelasting());
		System.out.println("Aantal wielen: " + auto.getAantalWielen());
	}
}
