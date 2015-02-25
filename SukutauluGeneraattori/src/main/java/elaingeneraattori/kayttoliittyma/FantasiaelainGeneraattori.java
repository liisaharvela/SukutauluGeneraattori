/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaingeneraattori.kayttoliittyma;

/**
 *
 * @author Liisa
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import static javax.management.Query.plus;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FantasiaelainGeneraattori implements Runnable {

    private JFrame frame;
    private int laskunTulos;

    @Override
    public void run() {
        frame = new JFrame("Generoi eläin");
        frame.setPreferredSize(new Dimension(1000, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        container.setLayout(new GridLayout(4, 1));
        
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
        
        container.add(nimi);
        
        JPanel kolmasPaneli = new JPanel(new GridLayout(1, 3));
        kolmasPaneli.add(laji);
        kolmasPaneli.add(vari);
        kolmasPaneli.add(skp);
        container.add(kolmasPaneli);
        
        JPanel toinenPaneli = new JPanel(new GridLayout(1, 2));
        toinenPaneli.add(isa);
        toinenPaneli.add(ema);
        container.add(toinenPaneli);

        JButton generoi = new JButton("Generoi");
        JPanel paneli = new JPanel(new GridLayout(1, 1));
        paneli.add(generoi);
        container.add(paneli);
        


        Tapahtumakuuntelija kasittelija = new Tapahtumakuuntelija(generoi, nimi, skp, vari, laji, isa, ema);
        generoi.addActionListener(kasittelija);
    }

    public JFrame getFrame() {
        return frame;
    }
}
