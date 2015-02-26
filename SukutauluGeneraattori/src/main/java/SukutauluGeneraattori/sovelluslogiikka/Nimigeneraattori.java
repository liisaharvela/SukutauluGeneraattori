/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

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
        String[] names1 = {"Kairan", "Sam", "Sareli", "Soir", "Noire", "Freppe", "Argentum", "Rastafa", "Renoir", "Renate", 
        "Riesling", "Korelie", "Kampuro", "Kampadie", "Avengel", "Avanchensel", "Avalanche", "Maelstrom", "Rain", "Gust", 
        "Volcans", "Voracious", "Vindaloo", "Rampager", "Roar", "Cirion", "Cirel", "Gold", "Turquoise", "Ambroise", 
        "Philistine", "Femoral", "Celestine", "January", "Mint", "Pepper", "Salt", "Cairo", "Tangiers", "Olden", "Silver"};
        String[] names2 = {"", " "};
        String[] names3 = {"", "Bungalow", "", "Jones", "Jewel", "", "Silmaril", "Centurion", "", "Celestial", "Thaumanova", "Thaum", 
        "Uderfrykte", "", "Effelant", "Effervescent", "", "Crystalline", "", "Faceted", "Facetious", "Fascimile", "Fenrir", "Fael", "Noelle", 
        "Hoonding", "", "Hircine", "", "Sanguine", "Azura", "Daedra", "", "Fyr", "Kaftanet", "Kanet", "Khajiit", "Peryite", "Sheogorath", 
        "Rambuction", "Arterion"};

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
            "Cockalorum", "", "Collop", "", "Codswallop", "Comeuppance", "Crudivore", "Cockamamie", "Fad", "Geneve", "Gene", "Kaleidescope", 
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
        String[] names1 = {"Jemima", "Elizabeth", "Beatrice", "Candice", "Cadavarelle", "Cornish", "Calliope", "Amelle", 
        "Trezebelina", "Thumbelina", "June", "Elephantine", "Sugary", "Welsh", "Pink", "Golden", "Chantelle", "Alayne", "Maurina", 
        "Harvelle", "Jerusalem", "Israel", "Manticora", "Merengue"}; // lisää nimiä myöhemmin
        String[] names2 = {"", "Hugger", "", "", "", "", "", "", "Lover", "January", "Mint", "Rog", "Jocelyn", "Grace", 
        "Amber", "Althena", "Althea", "Emerie", "Emanuelle", "Angelie", "Angelique", "Angel", "Celestina", "Ferdina", 
        "Flourescent", "Feathers", "Wings", "Flowers", "Meadow", "Stone", "Tango", "Hota"};

        String name1 = names1[(int) (Math.random() * names1.length)];
        String name2 = names2[(int) (Math.random() * names2.length)];

        return name1 + " " + name2;
    }

}
