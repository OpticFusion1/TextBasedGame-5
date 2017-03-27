/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Zack
 */

public class GameController {
    // Our global variables
    private boolean invalidInput = true;
    String name;
    String helpInput;
    boolean game = true;
    
    public void intro() {
        System.out.println(
                         ">> Welcome to Text Based Adventure Game! <<\n\n"
                        + "The objective of this game is to find your way through\n" 
                        + "the dungeon and collect as much gold as possible. \n\n"
                        + "You don't have a map and only a flaslight at your \n"
                        + "disposal to light up your quest.\n"
                        + "At any time during your quest, type help and get some options\n"
                        + "You forgot to eat so you have to finish your quest\n"
                        + "before you faint and is eaten by moths and bats \n"
                        + "and big ugly spiders and then eventually die,  \n"
                        + "which in that case you have lost. \n"
                        + "Your health is at 100% when you start and you will\n"
                        + "gradually lose your health while your walking around.\n"
                        + "because you are hungry and no food is available\n"
                        + "You have won the game when you have found the Exit\n"
                        + "and collected at least 20 goldpieces.\n\n\n\n");
    }
    
  
    
     public void chooseDirection(){
    
        System.out.println("Where do you wanna go");
        System.out.println("Press n for north");
        System.out.println("Press s for south");
        System.out.println("Press e for east");
        System.out.println("Press w for west");
    }
     
     
   
   
    
    public void runGame() throws InterruptedException {
        
        
        Scanner userInput = new Scanner(System.in);
        // initalise room
        Room[][] roomMatrix = new RoomFactory().createRooms();
      
       // initialise new player
        Player n1 = new Player(name, 100, roomMatrix[0][0], 1, 0);
        
        
        
        System.out.println("You have now entered the dungeon");
        
        
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
                    quit(n1);
                    System.exit(0);
                }
             
                // asks user for direction to go
                chooseDirection();
                
                String brugerInput = userInput.nextLine();
                
                
                 // HELP MENU IF USER TYPES HELP
                if(brugerInput.equalsIgnoreCase("help")) {
                    help(n1);
                }
                
                 // QUIT MENU IF USER TYPES HELP
                if(brugerInput.equalsIgnoreCase("quit")) {
                    quit(n1);
                    System.exit(0);
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
                       Thread.sleep(200);
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
                       Thread.sleep(200);
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
        System.out.println(n1.getLocation().getDescription());
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
       
    public void quit(Player n1){
        System.out.println("The Game Finished ! ");
        System.out.println("Your Stats: ");
        System.out.println("You collected: "+n1.getPlayerGold()+" gold coins");
    }
    
    
     
}
