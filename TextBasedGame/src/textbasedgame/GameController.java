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
    
    public void run(){
        Scanner userInput = new Scanner(System.in);
        // initalise room
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4);
        Room r5 = new Room(5);
        Room r6 = new Room(6);
        Room r7 = new Room(7);
        Room r8 = new Room(8);
        Room r9 = new Room(9);
        Room r10 = new Room(10);
        // initalise position for each room
        r1.setNorth(r8);
        r1.setEast(r2);
        
        r2.setNorth(r3);
        r2.setWest(r1);
        
        r3.setWest(r4);
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
            
            
            /*
            while userAnswer is north
            */
            
            // 
            // check if there is a room north
            // if there is update user position, to current north room.
            
            
            /*
            while userAnswer is south
            */
            // 
            // check if there is a room South
            // if there is update user position, to current south room.
            
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
