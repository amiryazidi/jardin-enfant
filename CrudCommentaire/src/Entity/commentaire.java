/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author AmiR
 */
public class commentaire {
    private int id;
    private String nom;
    private String texte;
    
    
     public commentaire() {
    }

    public commentaire(int id, String nom, String texte) {
        this.id = id;
        this.nom = nom;
        this.texte = texte;
    }

    public commentaire(String nom,  String texte) {
        this.nom = nom;
        this.texte = texte;
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

  

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    @Override
    public String toString() {
        return "commentaire{" + "id=" + id + ", nom=" + nom + ", texte=" + texte + '}';
    }

   
    

    
    
    
     
}
