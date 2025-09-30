package org.example;

public class Chapitre implements Document {
    public String titre;
    public String[] pages;

    public Chapitre(String titre, String[] pages) {
        this.titre = titre;
        this.pages = pages;
    }

    @Override
    public String getTitre() {
        return titre;
    }

    public int getTaille() {
        return pages.length;
    }
}
