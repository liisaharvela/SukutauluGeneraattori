/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

/**
 *
 * @author Liisa
 */
public class HTMLTulostin {

    public static String HTMLTulostaja() {

        Elain elain = new Elain();
        
        String tulostettava = "<table border=\"1\" style=\"border-collapse: collapse;\" cellpadding=\"7\">\n"
                + "<tr> \n"
                + "<td rowspan=\"4\" width=\"200\"> \n"
                + "\n"
                + elain.forHTML() 
                + "\n"
                + "</td> \n"
                + "<td rowspan=\"2\" width=\"200\"> \n"
                + "\n"
                + elain.getIsanNimi()
                + "</td> \n"
                + "\n"
                + "<td width=\"200\"> \n"
                + elain.getIsanIsanNimi()
                + "</td> \n"
                + "</tr> \n"
                + "<tr> \n"
                + "\n"
                + "<td> \n"
                + elain.getIsanEmanNimi()
                + "\n"
                + "</td> \n"
                + "</tr> \n"
                + "\n"
                + "<tr> \n"
                + "<td rowspan=\"2\"> \n"
                + "\n"
                + elain.getEmanNimi()
                + "</td> \n"
                + "<td> \n"
                + elain.getEmanIsanNimi()
                + "\n"
                + "</td> \n"
                + "</tr> \n"
                + "<tr> \n"
                + "\n"
                + "\n"
                + "<td> \n"
                + "\n"
                + elain.getEmanEmanNimi()
                + "\n"
                + "</td> \n"
                + "</tr> \n"
                + "</table>";

        return tulostettava;
    }

}
