/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_bidding.registration;

/**
 *
 * @author 01957
 */
//GETTING DATA
public class User {
     String NAME,CATEGORY,DEPARTMENT_NAME;
            int PROPOSAL_PRICE,TOTAL_RUN,ID ;
            byte[]PICTURE;
            public User(int ID,String NAME,String CATEGORY,String DEPARTMENT_NAME, byte[]PICTURE,int PROPOSAL_PRICE,int TOTAL_RUN)
            {
                this.ID=ID;
                this.NAME=NAME;
                this.CATEGORY=CATEGORY;
                this.DEPARTMENT_NAME=DEPARTMENT_NAME;
                this.PROPOSAL_PRICE=PROPOSAL_PRICE;
                this.TOTAL_RUN=TOTAL_RUN;
                this.PICTURE=PICTURE;
               
                
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
              public int getPROPOSAL_PRICE(){
                return PROPOSAL_PRICE;
            }
              public int getTOTAL_RUN(){
                return TOTAL_RUN;
            }
               public int getID(){
                return ID;
            }
               public byte[] getPICTURE(){
                  return PICTURE; 
               }
             
}
