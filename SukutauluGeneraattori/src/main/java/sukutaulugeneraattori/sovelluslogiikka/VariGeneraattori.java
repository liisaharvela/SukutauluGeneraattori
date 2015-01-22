/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

import java.util.Random;

/**
 *
 * @author Liisa
 */
public class VariGeneraattori {

    public static String vainPerusvarit() {
        return "naru";
    }
    
    public static String salliErikoisvarit() {
        return "naru";
    }

    public static int randomNumberGenerator(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
