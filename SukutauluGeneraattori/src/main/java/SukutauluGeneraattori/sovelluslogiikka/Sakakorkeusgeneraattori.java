/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

import java.util.Random;

/**
 * Luokka generoi säkäkorkeuden tietyin sallituin parametrein
 *
 * @author Liisa
 */
public class Sakakorkeusgeneraattori {

    /**
     * Metodi generoi tiettyjen parametrien sisällä randomilla säkäkorkeuden
     * eläimelle
     *
     * @param max Korkein sallittu säkäkorkeus
     * @param min Matalin sallittu säkäkorkeus
     * @return säkäkorkeus muodossa int
     */
    public static int generoiSakakorkeus(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

}
