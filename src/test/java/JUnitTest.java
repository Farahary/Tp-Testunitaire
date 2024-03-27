/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import mg.inclusiv.cdan008.calculatrice.Calculatrice;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inclusive-PC
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    
    @Test
    public void testAddition() {
        assertEquals(4, Calculatrice.addition(1, 3),4);
        assertEquals(-14, Calculatrice.addition(-9, -5),-14);
        assertEquals(-8, Calculatrice.addition(-6, -2),-8);
    }

    @Test
    public void testSoustraction() {
        assertEquals(7, Calculatrice.soustraction(10, 3),7);
        assertEquals(-6, Calculatrice.soustraction(-5, 1),-6);
        assertEquals(-7, Calculatrice.soustraction(1,8),-7);
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, Calculatrice.multiplication(6, 2), 12);
        assertEquals(-6, Calculatrice.multiplication(-2, 3), -6);
        assertEquals(0, Calculatrice.multiplication(5, 0), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(5, Calculatrice.division(15, 3), 5);
        assertEquals(-6, Calculatrice.division(-12, 2), -6);
        assertEquals(0, Calculatrice.division(0, 4), 0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
