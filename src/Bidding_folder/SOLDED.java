/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidding_folder;

/**
 *
 * @author 01957

 */
       
//GETTING VALUE FROM ARRAYLIST
public class SOLDED {

     String NAME,EMAIL,CATEGORY,DEPARTMENT_NAME,TEAM_NAME;
        int ID,PRICE;
    public SOLDED(int ID, String NAME, String EMAIL, String CATEGORY, String DEPARTMENT_NAME, String TEAM_NAME, int PRICE) {
        
                this.ID=ID;
                this.NAME=NAME;
                this.CATEGORY=CATEGORY;
                this.DEPARTMENT_NAME=DEPARTMENT_NAME;
                this.EMAIL=EMAIL;
                this.TEAM_NAME=TEAM_NAME;
                this.PRICE=PRICE;
    }
     public String getNAME(){
                return NAME;
            }

             public String getCATEGORY(){
                return CATEGORY;
            }
             public String getDEPARTMENT_NAME(){
                return DEPARTMENT_NAME;
            }
              public int getID(){
                return ID;
            }
              public String getEMAIL(){
                return EMAIL;
            }
               public String getTEAM_NAME(){
                return TEAM_NAME;
            }
               public int getPRICE(){
                  return PRICE; 
               }
             
    
}
