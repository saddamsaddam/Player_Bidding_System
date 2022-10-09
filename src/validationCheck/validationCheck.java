/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationCheck;

import Home_folder.TEAMVIEW_HOME;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 01957
 */
public class validationCheck {
    boolean teamcheck=false;
    public boolean emptycheck(String ss,String sss)
    {
        if(ss.equals("") && sss.equals(""))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean teamcheck(String tt){
         try {
          
         
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://SADDAMNVN:1433;databaseName=Player_bidding;integratedSecurity=true;";
            java.sql.Connection  con =DriverManager.getConnection(url);
           
            String querymax=" SELECT  P.ID,P.NAME,P.EMAIL,P.CATEGORY,P.DEPARTMENT_NAME,B.TEAM_NAME,B.PRICE FROM PLAYER_REGISTRATION P ,BIDDING_TABLE B where P.ID = B.PLAYER_ID AND B.TEAM_NAME='"+tt+"'";
            Statement state=con.createStatement();
            ResultSet rrr= state.executeQuery(querymax);

            while(rrr.next()){
              teamcheck=true;
            }
    
          
            System.out.println("Connection created ssssss");

        }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Sorry bro");
        }
         return teamcheck;
    }
}
