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
//GETTING DATA
class Users {
    String TEAM_NAME,category; 
    int PRICE,PLAYER_ID;
    public Users(String TEAM_NAME,int PRICE,int PLAYER_ID,String category)
    {
            this.TEAM_NAME=TEAM_NAME;
            this.PRICE=PRICE;
            this.PLAYER_ID=PLAYER_ID;
            this.category=category;
            
    }
      public String getTEAM_NAME()
      {
                return TEAM_NAME;
       }
      public int getPRICE()
      {
          return PRICE;
      }
      public int getPLAYER_ID()
      {
          return PLAYER_ID;
      }
      public String getCATEGORY()
      {
          return category;
      }
    
}
/*
         while(rs.next())
            {
               user=new Users(rs.getString("TEAM_NAME"),rs.getInt("PRICE"),rs.getInt("PLAYER_ID")); 
            }
            userLists.add(user);
*/
