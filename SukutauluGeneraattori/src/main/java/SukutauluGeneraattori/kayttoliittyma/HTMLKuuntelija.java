/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.kayttoliittyma;

import sukutaulugeneraattori.sovelluslogiikka.HTMLTulostin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * Luokka sisältää ActionListenerin jonka reagoi HTML-koodin tulostusnappiin generaattorin käyttöliittymässä
 * @author Liisa
 */
public class HTMLKuuntelija implements ActionListener {

    private JButton generoiKoodi;
    private JTextField koodiKentta;

    /**
     * Konstruktori, joka alustaa HTMLKuuntelijan
     * @param generoiKoodi Koodin generoimisnappi
     * @param koodiKentta Kenttä, johon koodi tulee näkyviin
     */
    
    public HTMLKuuntelija(JButton generoiKoodi, JTextField koodiKentta) {
        this.generoiKoodi = generoiKoodi;
        this.koodiKentta = koodiKentta;

    }
    
    /**
     * Tapahtumankuuntelijan toiminnallisuus
     * @param ae ActionEvent
     */

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == generoiKoodi) {
            String tulostaKoodi = HTMLTulostin.HTMLTulostaja();
            koodiKentta.setText(tulostaKoodi);
        }

    }
}