/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Database;

import Entity.club;
import service.ClubService;

/**
 *
 * @author AmiR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
     /*   DataSource ds1=DataSource.getInstance();
        System.out.println(ds1);
        DataSource ds2=DataSource.getInstance();
        DataSource ds3=DataSource.getInstance();
        System.out.println(ds2);
        System.out.println(ds3);*/

     
        club p1 = new club ("Clubdessin", "club2");
        ClubService ps =new ClubService();
       //ps.delete(10);
        ps.update(p1);
        //  ps.insert(p1);
        ps.displayAll().forEach(System.out::println);
    // ps.rechercher().forEach(System.out::println);

    }
    
}
