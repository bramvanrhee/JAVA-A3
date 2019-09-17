package Opdracht2_3;

public class opdracht2_3 {
	public static void main(String[] args) {
		auto auto = new auto();
		
		auto.setMerk("Audi");
		auto.setType("A4");
		auto.setKleur("mat zwart");
		auto.setGewicht(1425);
		auto.setBrandstof("diesel");
		auto.bepaalBelasting(auto.getBrandstof(), auto.getGewicht());
		
		System.out.println("Merk en type: " + auto.getMerk() + " " + auto.getType());
		System.out.println("Kleur: " + auto.getKleur());
		System.out.println("Gewicht: " + auto.getGewicht());
		System.out.println("Wegenbelasting: " + auto.getBelasting());
		System.out.println("Aantal wielen: " + auto.getAantalWielen());
	}
}
