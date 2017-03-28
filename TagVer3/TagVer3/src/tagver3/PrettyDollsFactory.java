/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3;

/**
 *
 * @author BenedikteEva
 */
public class PrettyDollsFactory implements Items {
    
   
     public PrettyDolls[] createDolls (){
         
         PrettyDolls doll[] = new PrettyDolls[6];
    
         doll[0]=new PrettyDolls("Wanda", "You look at a doll with beautiful"
                 + " saphires as eyes. You pause for a moment and take a deep breath", 3);
         
         doll[1]= new PrettyDolls("Jubilee", "With emeralds as eyes, ruby lips "
                 + " and golden skin tone, reminds you somehow of a girl you once played with"
                 + "as a kid. You smile softly at the memory", 4);
         
         doll[2]=new PrettyDolls("Quanty", "Diamond eyes, snowywhite skin and hair, "
                 + "and slender body this etheral doll looks like an angel. A feeling of great calm"
                 + "rushes through you as you admire the slender doll", 5);
         
         doll[3]= new PrettyDolls("Ophelia", "With her sad black opal eyes and curly wild hair, and beautyful figure"
                 + "this gypsy queen makes you stop and stare and breathe deeply", 6);
         
         doll[4]= new PrettyDolls("Potsy", "Not exactly pretty, but with his roundness, bulging eyes "
                 + " and big smile, he makes you laugh, which was exactly what you needed to make your day",7);
         
         doll[5]=new PrettyDolls("","",0);
         
      return doll;
     }         

  
   

    @Override
    public void fetch() {
       // henter item fra rygsæk
    }

    @Override
    public void put() {
        //føj til rygsæk
    }

    @Override
    public void show() {
    // vis navn og beskrivelse
    }
     
}

