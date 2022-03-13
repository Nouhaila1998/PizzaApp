package com.example.pizza.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String dtailsIngred;
    private String description;
    private String preparation;
    private static int comp;

    public Produit(String nom, int nbrIngredients, int photo, String duree, String dtailsIngred, String description, String preparation) {
        this.id=comp++;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.dtailsIngred = dtailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDtailsIngred() {
        return dtailsIngred;
    }

    public void setDtailsIngred(String dtailsIngred) {
        this.dtailsIngred = dtailsIngred;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", dtailsIngred='" + dtailsIngred + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
