package com.mycompany.document;

public class Document {
    private String titre;
    private static int nombreDocuments = 0;

    // Constructeur par défaut
    public Document() {
        nombreDocuments++;
    }

    // Constructeur avec un paramètre pour initialiser le titre
    public Document(String titre) {
        this.titre = titre;
        nombreDocuments++;
    }

    // Méthode pour afficher le titre du document
    public void affiche() {
        System.out.println("Titre du document : " + titre);
    }

    // Méthode pour obtenir le nombre de documents créés
    public static int getNombreDocuments() {
        return nombreDocuments;
    }
}
