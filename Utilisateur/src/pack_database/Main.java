/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_database;


import Entity.utilisateur;

import service.utilisateurService;

/**
 *
 * @author AmiR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        utilisateur p1= new utilisateur ("mestiri","khaled","khaled.mestiri@esprit.tn","khaledmestiri","azerty123","Parent");
        utilisateur p2= new utilisateur ("mestiri","mohamed elyes","mohamedelyes.mestiri@esprit.tn","mohamedelyesmestiri","qwerty123","Responsable Jardin");
        utilisateur p3= new utilisateur ("yazidi","amir","amir.yazidi@esprit.tn","amiryazidi","AZERTY123","Parent");
        utilisateur p4= new utilisateur ("groun","moetez","moetez.groun@esprit.tn","moetezgroun","QWERTY123","Responsable Jardin");
        utilisateur p5= new utilisateur ("groun","moetez","moetez.groun@esprit.tn","moetezgroun","QWERTY123","Responsable Jardin");
        
        utilisateurService ps =new utilisateurService();
         
      ps.insert(p2);
      ps.insert(p3);
      ps.insert(p4);
      ps.insert(p5);
      //ps.delete(2);
      //ps.update(p1);    
      //ps.find().forEach(System.out::println);
      //ps.displayAll().forEach(System.out::println);
     

    }
    
}
