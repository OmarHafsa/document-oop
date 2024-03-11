/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.document;

/**
 *
 * @author FAROUK
 */
    public class Bibliothèque {
        private Document[] documents;
        private int nombreMaxDocuments;
        private int nombreDocumentsActuels;
    
        public Bibliothèque(int tailleMax) {
            documents = new Document[tailleMax];
            nombreMaxDocuments = tailleMax;
            nombreDocumentsActuels = 0;
        }
    
        public void ajouter(Document d) {
            if (nombreDocumentsActuels < nombreMaxDocuments) {
                documents[nombreDocumentsActuels] = d;
                nombreDocumentsActuels++;
            } else {
                System.out.println("La bibliotheque est pleine, impossible d'ajouter un nouveau document.");
            }
        }
    
        public void listing() {
            System.out.println("Contenu de la bibliotheque :");
            for (int i = 0; i < nombreDocumentsActuels; i++) {
                documents[i].affiche();
            }
        }
    }
    

