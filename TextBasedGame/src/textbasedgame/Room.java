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
    int currentRoom;
    Room west;
    Room east;
    Room north;
    Room south;
    String description;
    boolean locked;

    // initalize each room with the room to its left, right, up and down from current room, as well as if room is locked
    public Room(int currentRoom, String description) {
       this.currentRoom = currentRoom;
       this.description = description;
        
    }

    @Override
    public String toString() {
        return "Room{" + "Du er i rum" + currentRoom + ", description=" + description + '}';
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    
    public boolean roomIsLocked(){
        return locked;
    }
    
    // boolean check method whether there is room to its left, right, up and down
    
    public boolean canMoveWest(){
        if(getWest() != null){
            return true;
        }
        return false;
    }
    
    public boolean canMoveEast(){
        if(getEast() != null){
            return true;
        }
        return false;
    }
    
    public boolean canMoveNorth(){
        if(getNorth() != null){
            return true;
        }
        return false;
    }
    
    public boolean canMoveSouth(){
        if(getSouth() != null){
            return true;
        }
        return false;
    }
    
    // call method to get the room of the player depending on where he wants to go
    public Room getWest(){
        return west;
    }
    
    public Room getEast(){
        return east;
    }
    
    public Room getNorth() {
        return north;
    }
    
    public Room getSouth(){
        return south;
    }
    
    public void setWest(Room west) {
        this.west = west;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    
    
    
    
    
     
}
