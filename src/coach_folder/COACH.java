/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coach_folder;

/**
 *
 * @author 01957
 */
//GETTING DATA
class COACH {
    String NAME,EMAIL,CATEGORY,DEPARTMENT_NAME,TEAM_NAME;
        int ID,PRICE;
    public  COACH(int ID, String NAME, String EMAIL, String TEAM_NAME){
                this.ID=ID;
                this.NAME=NAME;
               
                this.EMAIL=EMAIL;
                this.TEAM_NAME=TEAM_NAME;
                
    }
     public String getNAME(){
                return NAME;
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
              
             
    
}
