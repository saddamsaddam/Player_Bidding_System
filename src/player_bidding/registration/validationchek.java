/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_bidding.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 01957
 */
// DEFFERENT VALIDATION CHECKING
public class validationchek {
 public  boolean  validationchek(String email){
         String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}"; 
          Pattern pattern = Pattern.compile(regex);  
           Matcher matcher = pattern.matcher(email); 
       return matcher.matches();
   }
     public  boolean  teamname(String teamname){
        String regex = "^[A-Z]+$"; 
     Pattern pattern = Pattern.compile(regex);  
           Matcher matcher = pattern.matcher(teamname); 
       return matcher.matches();
   }
      public  boolean  passwordcheck(String password){
        String regex = "^[A-Za-z0-9]+$"; 
       
     Pattern pattern = Pattern.compile(regex);  
           Matcher matcher = pattern.matcher(password); 
       return matcher.matches();
   }
    
    
}
