import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.resta(5, 3));
    }

    @Test
    void testMultiplica() {
        Calculadora calc = new Calculadora();
  
        assertEquals(12, calc.multiplica(4, 3));
    }

    @Test
    void testDivide() {
        Calculadora calc = new Calculadora();

        assertEquals(5, calc.divide(10, 2));
        
        assertEquals(-1, calc.divide(10, 0));
    }
}