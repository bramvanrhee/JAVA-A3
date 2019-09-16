package Opdracht2;

public class auto extends vervoermiddel{
	private int gewicht;
	private double belasting;
	
	public double getBelasting() {
		return belasting;
	}
	public void setBelasting(double belasting) {
		this.belasting = belasting;
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
}
