package com.example.tristan.todoliste;

/**
 * Created by Tristan on 05/03/2018.
 */

public class ObjectTask {
    int id;
    String Titre;
    String Texte;

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getTexte() {
        return Texte;
    }

    public void setTexte(String texte) {
        Texte = texte;
    }

    public ObjectTask(int idP, String titreP, String texteP){
         id = idP;
         Titre = titreP;
         Texte = texteP;
    }

}
