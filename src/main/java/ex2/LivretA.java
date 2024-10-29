package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur de livret A
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Ajouter le taux de remuneration au solde
	 */
	public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
