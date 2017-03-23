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
    private boolean invalidInput = true;
    String name;
    String helpInput;
    
    public void intro() {
        System.out.println("Welcome to Text Based Adventure Game");
        
    }
    
  
    
     public void chooseDirection(){
    
        System.out.println("Where do you wanna go");
        System.out.println("Press n for north");
        System.out.println("Press s for south");
        System.out.println("Press e for east");
        System.out.println("Press w for west");
    }
     
     
   
   
    
    public void runGame(){
        
        
        Scanner userInput = new Scanner(System.in);
        // initalise room
        Room[][] roomMatrix = new RoomFactory().createRooms();
      
       
        
        
        
        // initialise new player
        Player n1 = new Player(name, 100, roomMatrix[0][0], 1, 0);
        
        System.out.println("You are in room "+n1.getRoomNr());
        boolean game = true;
        while(game) {
           if (n1.getRoomNr() == 9) {
               System.out.println("You won");
               System.out.println("You collected "+n1.getPlayerGold()+" gold coins");
               invalidInput = false;
               System.exit(0);
           }
            invalidInput = true;
            while(invalidInput){
                if (n1.getHealth() < 1) {
                    System.out.println("Game Over");
                    System.exit(0);
                }
                // asks user for direction to go
                chooseDirection();
                
                String brugerInput = userInput.nextLine();
                
                
                 // HELP MENU IF USER TYPES HELP
                if(brugerInput.equalsIgnoreCase("help")) {
                    help(n1);
                }
                
                   // ROOM NORTH
                if (brugerInput.charAt(0) == 'n') {
                   if (n1.getLocation().getNorth() != null) {
                       direction(n1, n1.getLocation().getNorth());
                   }
                   // IF NO ROOM TO THAT DIRECTION
                   else {
                       System.out.println("No room north for room "+n1.getRoomNr());
                   }
                }
                
                // ROOM SOUTH
                if (brugerInput.charAt(0) == 's') {
                   if (n1.getLocation().getSouth() != null) {
                       direction(n1, n1.getLocation().getSouth());
                   }
                   // IF NO ROOM TO THAT DIRECTION
                   else {
                       System.out.println("No room south for room "+n1.getRoomNr());
                   }
                }
                
                // ROOM EAST
                if (brugerInput.charAt(0) == 'e') {
                   if (n1.getLocation().getEast() != null) {
                       direction(n1, n1.getLocation().getEast());
                   }
                   
                   // IF NO ROOM TO THAT DIRECTION
                   else {
                       System.out.println("No room east for room "+n1.getRoomNr());
                   }
                }
                // ROOM WEST
                if (brugerInput.charAt(0) == 'w') {
                   if (n1.getLocation().getWest() != null) {
                     direction(n1, n1.getLocation().getWest());
                     }
                   // // IF NO ROOM TO THAT DIRECTION
                   else {
                       System.out.println("No room west for room "+n1.getRoomNr());
                   }
                }
                // if user types gold
                // if user types quit
            }
         
        }
    }
    
    public void gameOver(){
         System.out.println("Game over");
    }

    private void direction(Player n1, Room nextRoom) {
        invalidInput = false;
       
        // sætter vores ny position for spilleren
        n1.setLocation(nextRoom);

        n1.setRoomNr(n1.getLocation().getCurrentRoom());
       
        
        int gold = nextRoom.getGold();
        int health = n1.getHealth();
        n1.setPlayerGold(n1.getPlayerGold()+gold);
        nextRoom.setGold(0);
        
        n1.setHealth(health-10);
        
        System.out.println("You are in room "+n1.getRoomNr());
        System.out.println("You found "+gold+" gold coins"+" your total gold "+n1.getPlayerGold());
        System.out.println("Your health is "+n1.getHealth());
        
    }
    
      public void help(Player n1){
         System.out.println("Help Menu");
        System.out.println("tryk exit for exit");
        Scanner scanHelp = new Scanner(System.in);
        helpInput = scanHelp.nextLine();
        if (helpInput.equalsIgnoreCase("exit")) {
            invalidInput = true;
            System.out.println("You are in room " + n1.getRoomNr());

        }
        invalidInput = false;
    }
      
      
     
}
