/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player_bidding.registration;

import java.awt.Image;
import javax.swing.ImageIcon;
//GETTING DATA
class PLAYER {
    String NAME,DEPARTMENT_NAME,CATEGORY,EMAIL;
    int PROPOSAL_PRICE,TOTAL_RUN,TOTAL_MATCH,TOTAL_WICKET,AVG_RUN;
    byte[] IMAGE;
    public  PLAYER(String NAME,String DEPARTMENT_NAME,String CATEGORY ,int  PROPOSAL_PRICE,String EMAIL,byte[] IMAGE,int TOTAL_RUN,int TOTAL_MATCH ,int TOTAL_WICKET,int AVG_RUN  )
    {
       
                this.NAME=NAME;
                this.CATEGORY=CATEGORY;
                this.DEPARTMENT_NAME=DEPARTMENT_NAME;
                this.PROPOSAL_PRICE=PROPOSAL_PRICE;
                this.TOTAL_RUN=TOTAL_RUN;
                this.IMAGE=IMAGE;
                this.EMAIL=EMAIL;
                this.TOTAL_WICKET=TOTAL_WICKET;
                this.TOTAL_MATCH=TOTAL_MATCH;
                this.AVG_RUN=AVG_RUN;
                
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
               public int getTOTAL_WICKET(){
                return TOTAL_WICKET;
            }
              
               public byte[] getIMAGE(){
                 System.out.println(IMAGE);
               return ((IMAGE));
               }
               public String getEMAIL()
               {
                   return EMAIL;
               }
               public int getAVG_RUN(){
                   return AVG_RUN;
               }
               public int getTOTAL_MATCH()
               {
                   return TOTAL_MATCH;
               }
               
}