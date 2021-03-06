/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.kayttoliittyma;

/**
 * Luokka sisältää ActionListenerin jonka reagoi eläimen generointinappiin generaattorin käyttöliittymässä
 * @author Liisa
 */
import sukutaulugeneraattori.sovelluslogiikka.Elain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tapahtumakuuntelija implements ActionListener {

    private JButton generoi;
    private JTextField nimi;
    private JTextField skp;
    private JTextField laji;
    private JTextField vari;
    private JTextField isa;
    private JTextField ema;
    private Elain elukka;
    
    /**
     * Konstruktori, joka alustaa Tapahtumankuuntelijan
     * @param generoi Generointinappi
     * @param nimi Nimikenttä
     * @param skp Sukupuolikenttä
     * @param vari Värikenttä
     * @param laji Lajikenttä
     * @param isa Isän tiedot näyttävä kenttä
     * @param ema Emän tiedot näyttävä kenttä
     */

    public Tapahtumakuuntelija(JButton generoi, JTextField nimi, JTextField skp, JTextField vari, JTextField laji, JTextField isa, JTextField ema) {
        this.generoi = generoi;
        this.nimi = nimi;
        this.skp = skp;
        this.vari = vari;
        this.laji = laji;
        this.isa = isa;
        this.ema = ema;
    }

    /**
     * Tapahtumankuuntelijan toiminnallisuus
     * @param ae ActionEvent
     */
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == generoi) {
            Elain elukka = new Elain();
            
            String tulostaNimi = elukka.getNimi();
            nimi.setText(tulostaNimi);
            
            String tulostaLaji = elukka.getLaji();
            laji.setText(tulostaLaji);
            
            String tulostaskp = elukka.getSkp();
            skp.setText(tulostaskp);
            
            String tulostavari = elukka.getVari();
            vari.setText(tulostavari);
            
            String tulostaisa = elukka.getIsa();
            isa.setText(tulostaisa);
            
            String tulostaema = elukka.getEma();
            ema.setText(tulostaema);
        }

    }

}
