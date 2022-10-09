/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidding_folder;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 01957
 */
//RETURN TEAM
public class exitteamchecking {
    boolean abc=false;
     int balance=0,batsman=0,bowler=0,allrounder=0;
    public boolean teamcheck(int teamname){
         try {
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(url);
               String querymaxC="select * from BIDDING_TABLE WHERE PLAYER_ID='"+teamname+"' ";
           
            Statement stateC=con.createStatement();
            ResultSet rssC= stateC.executeQuery(querymaxC);
            while(rssC.next()){
                abc=true;
            }
         }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Sorry bro");
        }   
      
        return abc;
    }
    //RETURN BALANCE
    public int balancechaking(String teambalance,int teamprice){
         try {
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(url);
               String querymaxC="select SUM(PRICE) AS SUM from BIDDING_TABLE WHERE TEAM_NAME='"+teambalance+"';";
           
            Statement stateC=con.createStatement();
            ResultSet rssC= stateC.executeQuery(querymaxC);
            while(rssC.next()){
                balance=rssC.getInt("SUM");
            }
         }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Sorry bro");
        }   
      
        return balance;
        
    }
//RETURN BATSMAN COUNT
   public  int batsmanchaking(String team_name) {
       try {
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(url);
               String querymaxC="select count(B.CATEGORY) AS SUM from BIDDING_TABLE B WHERE  B.CATEGORY='Batsman' and TEAM_NAME='"+ team_name+"'";
           
            Statement stateC=con.createStatement();
            ResultSet rssC= stateC.executeQuery(querymaxC);
            while(rssC.next()){
                batsman=rssC.getInt("SUM");
            }
         }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Sorry bro");
        }   
      return batsman;  
    }
//RETURN BOWLER COUNT
   public int bowlerchaking(String team_name) {
        try {
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(url);
               String querymaxC="select count(B.CATEGORY) AS SUM from BIDDING_TABLE B WHERE  B.CATEGORY='Bowler' and TEAM_NAME='"+ team_name+"'";
           
            Statement stateC=con.createStatement();
            ResultSet rssC= stateC.executeQuery(querymaxC);
            while(rssC.next()){
                bowler=rssC.getInt("SUM");
            }
         }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Sorry bro");
        }   
      return bowler;  
    }
//RETURN ALL ROUNDER COUNT
  public  int allrounderchaking(String team_name) {
try {
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(url);
               String querymaxC="select count(B.CATEGORY) AS SUM from BIDDING_TABLE B WHERE  B.CATEGORY='All_Rounder' and TEAM_NAME='"+ team_name+"'";
           
            Statement stateC=con.createStatement();
            ResultSet rssC= stateC.executeQuery(querymaxC);
            while(rssC.next()){
               allrounder=rssC.getInt("SUM");
            }
         }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Sorry bro");
        }   
      return allrounder;      }
    
}
