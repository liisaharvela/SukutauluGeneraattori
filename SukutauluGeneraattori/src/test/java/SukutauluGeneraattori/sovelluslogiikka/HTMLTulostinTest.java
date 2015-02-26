/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

import sukutaulugeneraattori.sovelluslogiikka.HTMLTulostin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.matchers.JUnitMatchers.either;

/**
 *
 * @author Liisa
 */
public class HTMLTulostinTest {

    public HTMLTulostinTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void HTMLTulostusSisaltaaSyotetynTiedon() {
        
        String elukkaYksi = HTMLTulostin.HTMLTulostaja();

        assertThat(elukkaYksi, either(containsString("uros")).or(containsString("naaras")));
    }
}
