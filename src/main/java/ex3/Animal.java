package ex3;

public class Animal {

    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur animal
     * @param nom
     * @param type
     * @param comportement
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter
     *
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter
     *
     * @param comportement comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
