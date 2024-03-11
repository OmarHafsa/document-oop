/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.document;

/**
 *
 * @author FAROUK
 */
/*public class test_document {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        Document document1= new Document("omar");
        Document document2 = new Document("hafsa");
        document1.affiche();
        
    }
    
}
*/
public class test_document{
    public static void main(String[] args) {
        // Création d'une bibliothèque pouvant contenir jusqu'à 5 documents
        Bibliothèque bibliothèque = new Bibliothèque(5);

        // Création de quelques documents
        Livre livre1 = new Livre("omar hafsa", "omar", "hafsa");
        Internet internet1 = new Internet("github", "https://github.com/OmarHafsa");
        

        // Ajout des documents à la bibliothèque
        bibliothèque.ajouter(livre1);
        bibliothèque.ajouter(internet1);

        // Affichage du contenu de la bibliothèque
        bibliothèque.listing();
    }
}
