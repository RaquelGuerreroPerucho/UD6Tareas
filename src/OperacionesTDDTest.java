import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @org.junit.jupiter.api.Test
    void operacionesTestA() {
        String imput="";

        int resultadoEsperado= 0;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void operacionesTestB() {
        String imput="1";

        int resultadoEsperado= 1;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void operacionesTestC() {
        String imput="1,2";

        int resultadoEsperado= 3;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void operacionesTestD() {
        String imput="1,1,2";

        int resultadoEsperado= 4;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void operacionesTest5A() {
        String imput="1,2,";

        int resultadoEsperado= -1;
        int resultadoReal= OperacionesTDD.sumarNumeros(imput);
        assertEquals(resultadoEsperado, resultadoReal);
    }



}