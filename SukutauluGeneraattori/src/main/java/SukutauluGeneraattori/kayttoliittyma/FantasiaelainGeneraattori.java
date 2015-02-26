/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.kayttoliittyma;

/**
 * Luokka sisältää graafisen käyttöliittymän
 *
 * @author Liisa
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FantasiaelainGeneraattori implements Runnable {

    private JFrame frame;
    private int laskunTulos;

    /**
     * Metodi alustaa Swing-komponenttien JFramen
     *
     */
    @Override
    public void run() {
        frame = new JFrame("Fantasiaeläingeneraattori");
        frame.setPreferredSize(new Dimension(1000, 600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Metodi luo Swing-komponentit sekä asettelee ne järkevästi näkyviin
     * käyttäjän ruudulle.
     *
     * @see SukutauluGeneraattori.kayttoliittyma.HTMLKuuntelija#HTMLKuuntelija(javax.swing.JButton, javax.swing.JTextField) 
     * @see SukutauluGeneraattori.kayttoliittyma.Tapahtumakuuntelija#Tapahtumakuuntelija(javax.swing.JButton, javax.swing.JTextField, javax.swing.JTextField, javax.swing.JTextField, javax.swing.JTextField, javax.swing.JTextField, javax.swing.JTextField) 
     * @param container Swing-komponenttien Container
     */
    private void luoKomponentit(Container container) {
        container.setLayout(new GridLayout(10, 1));

        JTextField selitys = new JTextField("Tervetuloa fantasiaeläingeneraattoriin. Voit joko generoida eläimen taulukkomuodossa generaattorissa tai suoraan esitäytettyyn HTML-sukutauluun.");
        selitys.setEditable(false);
        selitys.setHorizontalAlignment(JTextField.CENTER);
        container.add(selitys);

        JTextArea tyhjaKaksi = new JTextArea();
        tyhjaKaksi.setEditable(false);
        container.add(tyhjaKaksi);

        JButton nimiteksti = new JButton("Nimi:");
        nimiteksti.setEnabled(false);

        JButton ptteksti = new JButton("Perustiedot:");
        ptteksti.setEnabled(false);

        JButton sukuteksti = new JButton("Sukutiedot:");
        sukuteksti.setEnabled(false);

        JTextField nimi = new JTextField("Eläimen nimi");
        nimi.setHorizontalAlignment(JTextField.CENTER);

        JTextField skp = new JTextField("sukupuoli");
        skp.setHorizontalAlignment(JTextField.CENTER);

        JTextField vari = new JTextField("Väritys");
        vari.setHorizontalAlignment(JTextField.CENTER);

        JTextField laji = new JTextField("Laji");
        laji.setHorizontalAlignment(JTextField.CENTER);

        JTextField isa = new JTextField("Isä");
        isa.setHorizontalAlignment(JTextField.CENTER);

        JTextField ema = new JTextField("Emä");
        ema.setHorizontalAlignment(JTextField.CENTER);

        JPanel neljasPaneli = new JPanel(new GridLayout(2, 1));
        neljasPaneli.add(nimiteksti);
        neljasPaneli.add(nimi);
        container.add(neljasPaneli);

        JPanel kolmasPaneli = new JPanel(new GridLayout(1, 4));
        container.add(ptteksti);
        kolmasPaneli.add(laji);
        kolmasPaneli.add(vari);
        kolmasPaneli.add(skp);
        container.add(kolmasPaneli);

        JPanel toinenPaneli = new JPanel(new GridLayout(1, 2));
        container.add(sukuteksti);
        toinenPaneli.add(isa);
        toinenPaneli.add(ema);
        container.add(toinenPaneli);

        JButton generoi = new JButton("Generoi eläimen tiedot taulukkoon");
        JPanel paneli = new JPanel(new GridLayout(1, 1));
        paneli.add(generoi);
        container.add(paneli);

        JTextArea tyhja = new JTextArea();
        tyhja.setEditable(false);
        container.add(tyhja);

        JTextField koodiKentta = new JTextField("Koodi");
        nimi.setHorizontalAlignment(JTextField.CENTER);
        JButton generoiKoodi = new JButton("Generoi esitäytetty sukutaulu HTML-koodina");
        JPanel paneliKoodi = new JPanel(new GridLayout(2, 1));
        paneliKoodi.add(koodiKentta);
        paneliKoodi.add(generoiKoodi);
        container.add(paneliKoodi);

        Tapahtumakuuntelija kasittelija = new Tapahtumakuuntelija(generoi, nimi, skp, vari, laji, isa, ema);
        generoi.addActionListener(kasittelija);

        HTMLKuuntelija kuuntelija = new HTMLKuuntelija(generoiKoodi, koodiKentta);
        generoiKoodi.addActionListener(kuuntelija);
    }

    /**
     * Metodi palauttaa JFramen
     * @return JFrame
     */
    
    public JFrame getFrame() {
        return frame;
    }
}
