

package textbasedgame;

/**
 *
 * @author Zack
 */
public class TextBasedGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        GameController g = new GameController();
//        
//        g.runGame();
//        
//        System.out.println("Hello world");

        int y;
        double x = 3.54;
        
        String s;
        
        
        Car k = new Car();
        
        Car b = new Car();
        
        b.setType("Cabriolet");
        
        b.setModel(2005);
        
        
        
        k.setType("Stationcar");
        
        k.setModel(1995);
        
        
        System.out.println(k.getType());
        
        
        
        
    }
    
}
