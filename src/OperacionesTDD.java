import java.util.Arrays;

public class OperacionesTDD {
    public static int sumarNumeros(String input) {

        if(input.equals("")) return 0;

        if(input.endsWith(",")) return -1;

        String[] numeros = input.split(",");



        int resultado = 0;

        for (String numero : numeros) {
            resultado += Integer.parseInt(numero);
        }

        return resultado;
    }
}
