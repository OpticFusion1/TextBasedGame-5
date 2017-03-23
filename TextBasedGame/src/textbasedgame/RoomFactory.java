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
public class RoomFactory {
    
    public Room[][] createRooms(){
        
         // initalise room
        Room[][] roomMatrix = new Room[3][3];
        
          // initalise position for each room
        roomMatrix[0][0] = new Room(1, "textbeskrivelse", 3);
        roomMatrix[0][1] = new Room(2, "textbeskrivelse", 6);
        roomMatrix[0][2] = new Room(3, "textbeskrivelse", 8);
        roomMatrix[1][0] = new Room(4, "textbeskrivelse", 4);
        roomMatrix[1][1] = new Room(5, "textbeskrivelse", 9);
        roomMatrix[1][2] = new Room(6, "textbeskrivelse", 7);
        roomMatrix[2][0] = new Room(7, "textbeskrivelse", 6);
        roomMatrix[2][1] = new Room(8, "textbeskrivelse", 4);
        roomMatrix[2][2] = new Room(9, "textbeskrivelse", 5);
        
        
        // EXITS FOR EACH ROOM
        // DOOR 1
        roomMatrix[0][0].setNorth(roomMatrix[2][1]);
        roomMatrix[0][0].setEast(roomMatrix[0][1]);
        
        // DOOR 2
        roomMatrix[0][1].setNorth(roomMatrix[0][2]);
        roomMatrix[0][1].setWest(roomMatrix[0][0]);
        
        // DOOR 3
        roomMatrix[0][2].setWest(roomMatrix[1][0]);
        roomMatrix[0][2].setSouth(roomMatrix[0][1]);
        
        // door 4
        roomMatrix[1][0].setEast(roomMatrix[0][2]);
        roomMatrix[1][0].setWest(roomMatrix[1][1]);
        
        // door 5
        roomMatrix[1][1].setSouth(roomMatrix[1][2]);
        roomMatrix[1][1].setEast(roomMatrix[1][0]);
        
        // door 6
        roomMatrix[1][2].setEast(roomMatrix[2][1]);
        roomMatrix[1][2].setNorth(roomMatrix[1][1]);
        roomMatrix[1][2].setSouth(roomMatrix[2][0]);
        
        
        // door 7
        roomMatrix[2][0].setNorth(roomMatrix[1][2]);
        roomMatrix[2][0].setWest(roomMatrix[2][2]);
        
        // door 8
        roomMatrix[2][1].setSouth(roomMatrix[0][0]);
        roomMatrix[2][1].setWest(roomMatrix[1][2]);
        
        // door 9
        roomMatrix[2][2].setEast(roomMatrix[2][0]);
        // door west == victory ???;
        return roomMatrix;
    }
}
