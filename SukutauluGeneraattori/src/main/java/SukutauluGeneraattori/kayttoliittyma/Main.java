
import SukutauluGeneraattori.kayttoliittyma.FantasiaelainGeneraattori;
import SukutauluGeneraattori.sovelluslogiikka.Elain;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Liisa
 */
public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new FantasiaelainGeneraattori());
    }

}
