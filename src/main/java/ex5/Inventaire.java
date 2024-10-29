package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, Integer.MAX_VALUE));
	}

	public void addItem(Item item) {
		for (Caisse c: caisses) {
			if (c.accepte(item)) {
				c.getItems().add(item);
				break;
			}
		}
	}

	public int taille() {
		
		//TODO faites évoluer ce code.
		return caisses.get(0).getItems().size() + caisses.get(1).getItems().size() + caisses.get(2).getItems().size();
	}
}
