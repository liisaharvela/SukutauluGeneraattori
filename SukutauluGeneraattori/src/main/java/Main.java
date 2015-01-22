


import sukutaulugeneraattori.sovelluslogiikka.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Liisa
 */
public class Main {

    public static void main(String[] args) {
        String oriNimi = Nimigeneraattori.suomalainenOri();
        System.out.println(oriNimi);
        
        String tammaNimi = Nimigeneraattori.suomalainenTamma();
        System.out.println(tammaNimi);
    }
    
}
