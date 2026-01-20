package es.fplumara.dam1.workshoptesting.core.calculator;

import net.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    public void testTrue(){
        int resultado = 3+5;
        assertTrue(true);
        assertEquals(8, resultado, "el resultado es incorrecto");
    }
    private static Calculator calculator;


    @BeforeAll
    public static void setUp(){
        calculator  = new Calculator();
    }

    @Test
    public void divisionEnteraPorero(){

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(4, 0);
        });
        assertEquals("Divided by zero", ex.getMessage());
    }
}
