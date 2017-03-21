/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

/**
 *
 * @author Zack
 */
public class Room {
     private int roomNr;
     private String roomDescription;
     private int goldAmount;

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
    
    public void setGoldAmount(int goldAmount){
        this.goldAmount = goldAmount;
    }
    
    public int getGoldAmount(){
        return goldAmount;
    }
     
}
