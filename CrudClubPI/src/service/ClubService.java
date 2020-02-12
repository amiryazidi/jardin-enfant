

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entity.club;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import package_Database.DataSource;

/**
 *
 * @author AmiR
 */
public class ClubService  implements IService<club>{
    
    private Connection cnx;
    public Statement st;
    public PreparedStatement ps;
    private ResultSet rs;
    
    public ClubService(){
        cnx=DataSource.getInstance().getcnx();
    }
    public void insert(club p){
        String req=" insert into tableclub( nom,descr) values('"+p.getNom()+"','"+p.getDescr()+"')";
        try {
            st=cnx.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ClubService.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ClubService.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
 

    @Override
    public void delete(int id) {
        String req="delete from tableclub where id =?";
        try{
            ps=cnx.prepareStatement(req);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void update(club t) {
        String sq1="UPDATE tableclub set nom='Club_Musique',descr='club3'" 
                +"WHERE id=40";
        try{
        ps=cnx.prepareStatement(sq1);
        ps.executeUpdate();
        }
            catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<club> displayAll() {
     List<club> list =new ArrayList<>();
        String req="select * from tableclub order by nom asc";
          try {
            st=cnx.createStatement();
            rs=st.executeQuery(req);
            while (rs.next())
            {
          list.add(new club (rs.getInt(1),rs.getString(2),rs.getString(3)));     
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClubService.class.getName()).log(Level.SEVERE, null, ex);
        }
          return list;    }
    
  
    public List<club> rechercher() {
     List<club> list =new ArrayList<>();
        String req="select * from tableclub where nom='AClubDessin'";
          try {
            st=cnx.createStatement();
            rs=st.executeQuery(req);
            while (rs.next())
            {
          list.add(new club (rs.getInt(1),rs.getString(2),rs.getString(3)));     
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClubService.class.getName()).log(Level.SEVERE, null, ex);
        }
          return list;    }
}
