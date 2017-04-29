package model;

public class Bureau {
	private Double longueur;
	private Double largeur;
	
	public Bureau(Double longueur, Double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	/**
	 * @return the longueur
	 */
	public Double getLongueur() {
		return longueur;
	}
	/**
	 * @return the largeur
	 */
	public Double getLargeur() {
		return largeur;
	}
	
	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}
	
}
