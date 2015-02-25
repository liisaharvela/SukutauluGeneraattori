/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaingeneraattori.sovelluslogiikka;

import java.util.Random;

/**
 *
 * @author Liisa
 */
public class Nimigeneraattori {

    public static String englantilainenNimi() {
        String[] names1 = {"George", "Benjamin", "Joseph"}; // lisää nimiä myöhemmin
        String[] names2 = {"", "Fabulous", "Egregious", "Argle", "Bargle", "Argyle", "Callipygian", "Canoodle", "Cantankerous", 
            "Cockalorum", "Collop", "Codswallop", "Comeuppance", "Crudivore", "Cockamamie", "Fard", "Fartlek", "Fatuous", 
            "Filibuster"};
        String[] names3 = {"", "Bungalow", ""};
        
        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];
        String name3 = names3[(int) (Math.random() * names3.length)];
        
        
        return name1 + " " + name2 + " " + name3;
    }

    public static String englantilainenOri() {
        String[] names1 = {"George", "Benjamin", "Joseph"}; // lisää nimiä myöhemmin
        String[] names2 = {"", "Fabulous", "Egregious"};
        String[] names3 = {"", "Bungalow", ""};
        
        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];
        String name3 = names3[(int) (Math.random() * names3.length)];
        
        
        return name1 + " " + name2 + " " + name3;
    }

    public static String englantilainenTamma() {
        String[] names1 = {"Jemima", "Elizabeth", "Beatrice"}; // lisää nimiä myöhemmin
        String[] names2 = {"", "Undercroft", "Lentil"};
        String[] names3 = {"", "Hugger", "", "Lover"};
        
        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];
        String name3 = names3[(int) (Math.random() * names3.length)];
        
        
        return name1 + " " + name2 + " " + name3;
    }

    public static String siansaksaOri() {
        return "naru";
    }

    public static String siansaksaTamma() {
        return "naru";
    }
    

}
