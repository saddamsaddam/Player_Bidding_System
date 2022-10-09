/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidding_folder;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 01957
 */
//ADDING VALUE IN ARRAYLIST
public class REMAINIST {
 public ArrayList<TEAMLIST> TEAMSEARCH()
 {
       ArrayList<TEAMLIST> teamname=new ArrayList<>();
       try
       {
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String urll="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(urll);
           String query1="SELECT * FROM SELECTOR_REGISTRATION";
           Statement state=con.createStatement();
            ResultSet rs= state.executeQuery(query1);
           TEAMLIST users;
            while(rs.next())
            {
               users=new TEAMLIST(rs.getString("TEAM_NAME"),rs.getString("NAME"),rs.getString("EMAIL"));
                teamname.add(users);
            }
           
              
       }
       catch(Exception e)
       {
           
       }
    return teamname;  
 }

    public static class TEAMLIST {
String teamname,name,email;
        public TEAMLIST(String teamname,String name,String email) {
            this.teamname=teamname;
            this.name=name;
            this.email=email;
        }
        public String getTEAM_NAME()
        {
            return teamname;
        }
         public String getNAME()
        {
            return name;
        }
          public String getEMAIL()
        {
            return email;
        }
    }
    
}
