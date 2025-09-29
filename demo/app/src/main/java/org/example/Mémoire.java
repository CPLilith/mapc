package org.example;

import java.util.List;

public class Mémoire implements Document {
    public String titre;
    public List<Chapitre> chapitres;


    public Mémoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;
        this.chapitres= chapitres;
    }

    public String getTitre() {
        return titre;
    }

    public int getTaille() {
        int tailleChapitres=0;
        for(Chapitre c: chapitres){
            tailleChapitres=tailleChapitres+c.getTaille();
        }
        return tailleChapitres;
    };
}
