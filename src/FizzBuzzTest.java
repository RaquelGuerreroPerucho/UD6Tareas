import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @org.junit.jupiter.api.Test
    void devolucionFormatoString1Test() {
        int num=1;

        String resultadoEsperado= "1";
        String resultadoReal= FizzBuzz.getFizzBuzz(num);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void devolucionFormatoString2Test() {
        int num=2;

        String resultadoEsperado= "2";
        String resultadoReal= FizzBuzz.getFizzBuzz(num);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void devolucionFormatoString3Test() {
        int num=3;

        String resultadoEsperado= "Fizz";
        String resultadoReal= FizzBuzz.getFizzBuzz(num);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void devolucionFormatoString4Test() {
        int num=4;

        String resultadoEsperado= "4";
        String resultadoReal= FizzBuzz.getFizzBuzz(num);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void devolucionFormatoString5Test() {
        int num=5;

        String resultadoEsperado= "Buzz";
        String resultadoReal= FizzBuzz.getFizzBuzz(num);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void devolucionFormatoString6Test() {
        int num=6;

        String resultadoEsperado= "Fizz";
        String resultadoReal= FizzBuzz.getFizzBuzz(num);
        assertEquals(resultadoEsperado, resultadoReal);
    }

}