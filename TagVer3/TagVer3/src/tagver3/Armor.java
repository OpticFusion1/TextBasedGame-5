/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3;

/**
 *
 * @author Ticondrus
 */
public class Armor implements Items{

    
    private int armor;
    
    
        public int getArmor() {
            
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Armor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Armor{" + "armor=" + armor + '}';
    }

    @Override
    public void useItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pickItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void throwItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
