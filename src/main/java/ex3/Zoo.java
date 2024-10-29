package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private ArrayList<Animal> animaux = new ArrayList<Animal>();

    /**
     * Constructeur zoo
     * @param nom
     */
    public Zoo(String nom) {
        this.nom = nom;
    }

    /**
     * Méthode d'ajouts des caracteristiques dans les listes respectife
     * @param animal
     */
    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Méthode pour afficher les caracteristiques des animeaux
     */
    public void afficherListeAnimaux() {
        for (int i = 0; i < animaux.size(); i++) {
            System.out.println(animaux.get(i));
        }
    }

    /**
     * Getter for nom     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}