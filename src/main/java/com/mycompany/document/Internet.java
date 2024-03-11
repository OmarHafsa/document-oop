package com.mycompany.document;

public class Internet extends Document {
    private String url;

    public Internet(String titre, String url) {
        super(titre);
        this.url = url;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("URL : " + url);
    }
}
