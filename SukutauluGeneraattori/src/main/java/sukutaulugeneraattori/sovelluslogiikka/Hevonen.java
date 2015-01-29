/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

import static sukutaulugeneraattori.sovelluslogiikka.Sakakorkeusgeneraattori.generoiSakakorkeus;

/**
 *
 * @author Liisa
 */
public class Hevonen {
    
    private int sakakorkeus;
    
    public Hevonen () {
        this.sakakorkeus = 0;
    }
    
    public void nimeaHevonen () {
        
    }
    
    public void teeHepastaIso (int min, int max) {
        this.sakakorkeus = generoiSakakorkeus(min, max);
    }
    
    public void varjaaHevonen () {
       
    }
    
    public void annaRotuHevoselle () {
        
    }
}
