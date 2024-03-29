package com.mycompany.document;

public class Livre extends Document {
    private String editeur;
    private String auteur;

    public Livre(String titre, String editeur, String auteur) {
        super(titre);
        this.editeur = editeur;
        this.auteur = auteur;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Editeur : " + editeur);
        System.out.println("Auteur : " + auteur);
    }
}
