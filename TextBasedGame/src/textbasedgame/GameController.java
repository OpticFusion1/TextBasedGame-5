/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class GameController {
    
    public void intro() {
        System.out.println("Welcome to Text Based Adventure Game");
        
    }
   
    
    public void runGame(){
        
        
        Scanner userInput = new Scanner(System.in);
        // initalise room
        Room[][] roomMatrix = new Room[3][3];
      
        
        roomMatrix[0][0] = new Room(1);
      
        roomMatrix[0][1] = new Room(2);
        roomMatrix[0][2] = new Room(3);
        roomMatrix[1][0] = new Room(4);
        roomMatrix[1][1] = new Room(5);
        roomMatrix[1][2] = new Room(6);
        roomMatrix[2][0] = new Room(7);
        roomMatrix[2][1] = new Room(8);
        roomMatrix[2][2] = new Room(9);
        
        // initalise position for each room
        
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
        // door west == victory;
        
        
        
        
        // initialise new player
        Player n1 = new Player();
         boolean game = true;
//        System.out.println("Welcome to TAG Game");
//            System.out.println("What is your name");
//            // asks name of user
//            String name = userInput.nextLine();
//            n1.setName(name);
//            
//        
        n1.setLocation(roomMatrix[0][0]);
        n1.setRoomNr(n1.getLocation().getCurrentRoom());
       System.out.println("You are in room "+n1.getRoomNr());
        
        while(game) {
            
            boolean invalidInput = true;
            while(invalidInput){
                
                System.out.println("Where do you wanna go");
                System.out.println("Press n for north");
                System.out.println("Press s for south");
                System.out.println("Press e for east");
                System.out.println("Press w for west");
                String brugerInput = userInput.nextLine();
                String helpInput;
                
                 // if user types help
                if(brugerInput.equalsIgnoreCase("help")) {
                    System.out.println("Help Menu");
                    System.out.println("tryk exit for exit");
                    Scanner scanHelp = new Scanner(System.in);
                    helpInput = scanHelp.nextLine();
                    if(helpInput.equalsIgnoreCase("exit")) {
                      invalidInput = true; 
                        System.out.println("You are in room "+n1.getRoomNr());
                      
                    }
                    invalidInput = false;
                }
                
                
                
                // room North
                if (brugerInput.charAt(0) == 'n') {
                   if (n1.getLocation().getNorth() != null) {
                       invalidInput = false;
                       // sætter vores ny position for spilleren
                       n1.setLocation(n1.getLocation().getNorth());
                       n1.setRoomNr(n1.getLocation().getCurrentRoom());
                       System.out.println("You are currently in room "+n1.getRoomNr());
                       
                   }
                   else {
                       System.out.println("No room north for room "+n1.getRoomNr());
                   }
                }
                
                // room South
                if (brugerInput.charAt(0) == 's') {
                   if (n1.getLocation().getSouth() != null) {
                       invalidInput = false;
                       n1.setLocation(n1.getLocation().getSouth());
                       n1.setRoomNr(n1.getLocation().getCurrentRoom());
                       System.out.println("You are currently in room "+n1.getRoomNr());
                   }
                   else {
                       System.out.println("No room south for room "+n1.getRoomNr());
                   }
                }
                
                // room east
                if (brugerInput.charAt(0) == 'e') {
                   if (n1.getLocation().getEast() != null) {
                       invalidInput = false;
                       n1.setLocation(n1.getLocation().getEast());
                       n1.setRoomNr(n1.getLocation().getCurrentRoom());
                       System.out.println("You are currently in room "+n1.getRoomNr());
                   }
                   else {
                       System.out.println("No room east for room "+n1.getRoomNr());
                   }
                }
                // room west
                if (brugerInput.charAt(0) == 'w') {
                   if (n1.getLocation().getWest() != null) {
                       invalidInput = false;
                       n1.setLocation(n1.getLocation().getWest());
                       n1.setRoomNr(n1.getLocation().getCurrentRoom());
                       System.out.println("You are currently in room "+n1.getRoomNr());
                   }
                   // when location is null
                   else {
                       System.out.println("No room west for room "+n1.getRoomNr());
                   }
                }
                // if user types gold
                // if user types quit
                
            }
        }
    }
}
