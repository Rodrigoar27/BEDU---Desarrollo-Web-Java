import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("Prueba Suma")
    void sumaTest() {
        int esperado = 10;

        assertEquals(esperado, calculadora.suma(7,3));
    }

    @Test
    @DisplayName("Prueba Resta")
    void resta() {
        int esperado = 10;

        assertEquals(esperado,calculadora.resta(20,10));
    }

    @Test
    @DisplayName("Prueba Multiplica")
    void multiplica() {
        int esperado = 20;

        assertEquals(esperado,calculadora.multiplica(4,5));
    }

    @Test
    @DisplayName("Prueba Divide")
    void divide() {
        int esperado = 10;
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0), "No es posible dividir un valor entre 0");

    }
}