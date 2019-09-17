package Opdracht2_3;

public class auto extends vervoermiddel{
	private int gewicht;
	private double belasting;
	private String brandstof;
	
	public String getBrandstof() {
		return brandstof;
	}
	
	public void setBrandstof(String brandstof) {
		this.brandstof = brandstof;
	}
	
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public int getAantalWielen() {
		return 4;
	}
	
	public double getBelasting() {
		return belasting;
	}
	
	public void bepaalBelasting(String brandstof, int gewicht) {
		this.belasting = 0;
		
		//Soort brandstof
		if (this.brandstof == "diesel") {
			this.belasting += 210;
		}
		if (this.brandstof == "benzine") {
			this.belasting += 40;
		}
		
		//Gewicht
		if (this.gewicht <= 800) {
			this.belasting += 29;
		}
		if (this.gewicht > 800 && this.gewicht <= 1000) {
			this.belasting += 38;
		}
		if (this.gewicht > 1001 && this.gewicht <= 1200) {
			this.belasting += 46; 
		}
		if (this.gewicht > 1201 && this.gewicht <= 1400) {
			this.belasting += 54;
		}
		if (this.gewicht > 1401 && this.gewicht <= 1600) {
			this.belasting += 62;
		}
		if (this.gewicht > 1601 && this.gewicht <= 1800) {
			this.belasting += 70;
		}
	
	}
}
