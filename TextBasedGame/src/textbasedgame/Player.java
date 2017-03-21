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
    private int location;

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
    
    
    public void setLocation(int location){
        this.location = location;
    }
    
    public int getLocation(){
        return location;
    }
}
