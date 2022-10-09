/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_folder;

/**
 *
 * @author 01957
 */
//GETTING DATA
public class TEAMVIEW_HOME {
 String NAME,EMAIL,CATEGORY,DEPARTMENT_NAME,TEAM_NAME;
        int PRICE;
    public TEAMVIEW_HOME( String NAME, String EMAIL, String CATEGORY, String DEPARTMENT_NAME, int PRICE) {
        
                this.NAME=NAME;
                this.CATEGORY=CATEGORY;
                this.DEPARTMENT_NAME=DEPARTMENT_NAME;
                this.EMAIL=EMAIL;
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
             
              public String getEMAIL(){
                return EMAIL;
            }
              
               public int getPRICE(){
                  return PRICE; 
               }
             
}
