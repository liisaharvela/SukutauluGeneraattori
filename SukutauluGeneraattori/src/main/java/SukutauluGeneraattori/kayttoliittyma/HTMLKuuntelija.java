/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.kayttoliittyma;

import SukutauluGeneraattori.sovelluslogiikka.HTMLTulostin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Liisa
 */
public class HTMLKuuntelija implements ActionListener {

    private JButton generoiKoodi;
    private JTextField koodiKentta;

    public HTMLKuuntelija(JButton generoiKoodi, JTextField koodiKentta) {
        this.generoiKoodi = generoiKoodi;
        this.koodiKentta = koodiKentta;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == generoiKoodi) {
            String tulostaKoodi = HTMLTulostin.HTMLTulostaja();
            koodiKentta.setText(tulostaKoodi);
        }

    }
}