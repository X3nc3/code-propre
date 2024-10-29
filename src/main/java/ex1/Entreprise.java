package ex1;

import java.util.Date;
/** Classe qui permet d'instencier l'objet entreprise
 */
public class Entreprise {

	/** Variable d'environement privé qui contient un entier et represente le numero siret de l'entreprise */
	private int siret;

	/** Variable d'environement privé qui contient une chaine de carctere et represente le nom de l'entreprise */
	private String nom;

	/** Variable d'environement privé qui contient une chaine de carctere et represente l'adresse de l'entreprise */
	private String adresse;

	/** Variable d'environement privé qui contient une date et represente la date de creation de l'entreprise */
	private Date dateCreation;

	/** Constante public qui contient un entier et represente le capital max de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/** Méthode public qui ne retourne rien et qui affiche le statut de l'entreprise  */
	public void AfficherStatut(){
		/** affichage des attributs de l'entreprise*/
		System.out.println(siret + nom + adresse + dateCreation);
	}

	/**
	 * Constructeur
	 *
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter
	 *
	 * @return siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 *
	 * @param siret siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 *
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 *
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 *
	 * @param adresse adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 *
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 *
	 * @param dateCreation dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
