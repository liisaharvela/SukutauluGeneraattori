/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

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
    public void HTMLGeneraattoriTulostaaLajinOikein() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.forHTML();

        assertThat(elukkaYksi, containsString(elainYksi.getLaji()));
    }
}
