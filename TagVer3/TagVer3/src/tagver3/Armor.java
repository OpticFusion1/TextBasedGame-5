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
public class Armor implements Items {

    public String getDescriptionarmor() {
        return descriptionarmor;
    }

    public void setDescriptionarmor(String descriptionarmor) {
        this.descriptionarmor = descriptionarmor;
    }

    public Armor(int armor, String descriptionarmor, String armorname) {
        this.armor = armor;
        this.descriptionarmor = descriptionarmor;
        this.armorname = armorname;
    }

    private int armor;
    
    String descriptionarmor;
    String armorname;

    
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getArmorname() {
        return armorname;
    }

    public void setArmorname(String armorname) {
        this.armorname = armorname;
    }

    

    



    

    @Override
    public void useItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Armor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pickItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void throwItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



@Override
        public String toString() {
        return "Armor{" + "armor=" + armor + '}';
    }


    @Override
    public void getItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
