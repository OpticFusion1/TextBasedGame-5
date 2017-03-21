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
        Room nRoom[][] = new Room[3][3];
        nRoom[0][0] = new Room();
        nRoom[0][0].setRoomNr(1);
        
        nRoom[0][1] = new Room();
        nRoom[0][1].setRoomNr(2);
        
        nRoom[0][2] = new Room();
        nRoom[0][2].setRoomNr(3);
        
        nRoom[1][0] = new Room();
        nRoom[1][0].setRoomNr(4);
        
        nRoom[1][1] = new Room();
        nRoom[1][1].setRoomNr(5);
        
        nRoom[1][2] = new Room();
        nRoom[1][2].setRoomNr(6);
        
        nRoom[2][0] = new Room();
        nRoom[2][0].setRoomNr(7);
        
        nRoom[2][1] = new Room();
        nRoom[2][1].setRoomNr(8);
        
        nRoom[2][2] = new Room();
        nRoom[2][2].setRoomNr(9);
        
        
        // initialise new player
        Player n1 = new Player();
        
        int currentRoom;
        int enter = 2;
        
        
        boolean game = true;
        
        while(game) {
            n1.setLocation(nRoom[0][0].getRoomNr());
            System.out.println("Welcome to TAG Game");
            System.out.println("What is your name");
            String name = userInput.nextLine();
            n1.setName(name);
            
            
            System.out.println("Your name is "+n1.getName());
            System.out.println("Where do you wanna go");
            
            
            if (n1.getLocation() == 1) {
                
                System.out.println("You are now in room 1");
            }
            game = false;
        }
        
        
        
    }
    
}
