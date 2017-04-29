package model;

public class AccessoireBureau {
	private String nom;
	private Double longueur;
	private Double largeur;
	
	
	public AccessoireBureau(String nom, Double longueur, Double largeur) {
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the longueur
	 */
	public Double getLongueur() {
		return longueur;
	}
	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}
	/**
	 * @return the largeur
	 */
	public Double getLargeur() {
		return largeur;
	}
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}
	
	@Override
	public String toString() {
		return ("Je suis " + nom + " et je mesure " + longueur + " X " + largeur + "\n");
	}
	
}
