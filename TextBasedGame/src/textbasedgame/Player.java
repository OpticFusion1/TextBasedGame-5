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
public class Player {
    private String name;
    private int health;
    private Room location;
    private int roomNr;
    private int playerGold;

    public Player(String name, int health, Room location, int roomNr, int playerGold) {
        this.name = name;
        this.health = health;
        this.location = location;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
    }

    
    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }
    
    

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
    public void setLocation(Room location){
        this.location = location;
    }
    
    public Room getLocation(){
        return location;
    }
}
