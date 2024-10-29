package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private int poidsItemMin;
	private int poidsItemMax;
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int poidsItemMin, int poidsItemMax) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.poidsItemMin = poidsItemMin;
		this.poidsItemMax = poidsItemMax;
	}

	public boolean accepte(Item item) {
		return item.getPoids()>= poidsItemMin && item.getPoids()<=poidsItemMax;
	}

	public int taille() {
		return items.size();
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
