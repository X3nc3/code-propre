package ex1;

import java.util.Date;

/** Classe qui permet d'instencier l'objet entreprise
 */
public class Entreprise {

	/** entier represente le numero siret */
	private int siret;

	/** chaine de carctere representant le nom */
	private String nom;

	/** chaine de carctere representant l'adresse */
	private String adresse;

	/** date representant la date de creation de l'entreprise */
	private Date dateCreation;

	/** entier representant le capital max de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/** affiche le statut de l'entreprise  */
	public void afficherStatut(){
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
