/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

/**
 * Luokka generoi Arraysta nimiä sukupuolen tai sukupuolineutraaliuden mukaan
 * @author Liisa
 */
public class Nimigeneraattori {

    /**
     * Metodi generoi kolmesta eri Arraysta randomilla yhden nimen, ja palauttaa
     * ne yhdistettynä Stringinä
     *
     * @return nimi muodossa String
     */
    public static String englantilainenNimi() {
        String[] names1 = {"Kairan", "Sam", "Sareli", "Soir", "Noire", "Freppe", "Argentum", "Rastafa"};
        String[] names2 = {"", " "};
        String[] names3 = {"", "Bungalow", ""};

        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];
        String name3 = names3[(int) (Math.random() * names3.length)];

        return name1 + " " + name2 + " " + name3;
    }

    /**
     * Metodi generoi kolmesta eri Arraysta randomilla yhden nimen, ja palauttaa
     * ne yhdistettynä Stringinä
     *
     * @return String nimi
     */
    public static String englantilainenUros() {
        String[] names1 = {"George", "Benjamin", "Joseph", "Rostofer", "Joyous", "Happy-Go-Lucky", "Argel", "Animositious", "Anchorage",
            "Basil", "Bandicoot", "Baloo", "Alabaster", "Cornidge", "", "Corifoule", "Didorie", "Danish", "Daniel", "Eustacious", "Eustace", "Euridge"}; // lisää nimiä myöhemmin
        String[] names2 = {"", "Fabulous", "Egregious", "", "Argle", "Bargle", "Argyle", "Callipygian", "Canoodle", "Cantankerous",
            "Cockalorum", "", "Collop", "", "Codswallop", "Comeuppance", "Crudivore", "Cockamamie", "Fard", "Fartlek", "Fatuous",
            "Filibuster", ""};

        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];

        return name1 + " " + name2;
    }

    /**
     * Metodi generoi kolmesta eri Arraysta randomilla yhden nimen, ja palauttaa
     * ne yhdistettynä Stringinä
     *
     * @return String nimi
     */
    public static String englantilainenNaaras() {
        String[] names1 = {"Jemima", "Elizabeth", "Beatrice"}; // lisää nimiä myöhemmin
        String[] names2 = {"", "Undercroft", "Lentil"};
        String[] names3 = {"", "Hugger", "", "Lover"};

        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];

        return name1 + " " + name2;
    }

}
