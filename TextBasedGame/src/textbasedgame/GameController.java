/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class GameController {
    
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
        roomMatrix[0][0].setNorth(roomMatrix[2][2]);
        roomMatrix[0][0].setEast(roomMatrix[0][1]);
        
        // DOOR 2
        roomMatrix[0][1].setNorth(roomMatrix[0][2]);
        roomMatrix[0][1].setWest(roomMatrix[0][0]);
        
        // DOOR 3
        roomMatrix[0][2].setWest(r4);
        r3.setSouth(r2);
        
        r4.setEast(r3);
        r4.setWest(r5);
        
        r5.setSouth(r7);
        r5.setWest(r6);
        r5.setEast(r4);
        
        r6.setEast(r5);
        
        r7.setNorth(r5);
        r7.setEast(r8);
        r7.setSouth(r9);
        
        r8.setSouth(r1);
        r8.setWest(r7);
        
        r9.setWest(r10);
        r9.setNorth(r7);
        
        r10.setEast(r9);
        r10.setWest(r10); // WIN ??
        
       
        
        
        // initialise new player
        Player n1 = new Player();
        
        int enter = 2;
        
        
        boolean game = true;
        
        while(game) {
            System.out.println("Welcome to TAG Game");
            System.out.println("What is your name");
            // asks name of user
            String name = userInput.nextLine();
            n1.setName(name);
            
            // initialise current room for user
            n1.setLocation(r1.getCurrentRoom());
            System.out.println("Your name is "+n1.getName());
            System.out.println("You are currently in Room "+n1.getLocation());
            System.out.println("Where do you wanna go");
            
            
            // Controls
            /*
            each up, down, left and right should be a while loop that gets turned on which pos. user want
            userKey up for north, userkey down for south, userkey left for west, userkey right for east
            */
            
            // update position subtract and add to x,y userPosition depending on where he want to go.
            // ie Up for north add at 0,0 x,y add +1 to y
            
            /*
            while userAnswer is north meaning userKey == to up
            */
            
            // 
            // check if there is a room north
            // if there is update user position, to current north room by subtract and add to x,y userPosition depending on where he want to go.
            
            
            /*
            while userAnswer is south meaning userKey == down
            */
            // 
            // check if there is a room South
            // if there is update user position, to current south room by subtract and add to x,y userPosition depending on where he want to go.
            
            /*
            while userAnswer is west
            */
            //  
            // check if there is a room west
            // if there is update user position, to current west room.
            
            /*
            while userAnswer is east
            */
            //  
            // check if there is a room east
            // if there is update user position, to current east room.

            
            game = false;
        }
        
        
        
    }
    
}
