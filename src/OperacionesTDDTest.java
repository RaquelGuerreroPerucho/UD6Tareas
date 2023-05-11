import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @org.junit.jupiter.api.Test
    void operacionesTest00() {
        String imput="";

        int resultadoEsperado= 0;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void operacionesTest01() {
        String imput="1";

        int resultadoEsperado= 1;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }



}