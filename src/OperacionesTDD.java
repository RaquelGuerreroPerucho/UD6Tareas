import java.util.Arrays;

public class OperacionesTDD {
    public static int sumarNumeros(String input) {

        if(input.equals("")) return 0;

        if(input.endsWith(",")) return -1;

        String[] numeros = input.split(",");

        int resultado = 0;

        for (String numero : numeros) {
            resultado += Integer.parseInt(numero);

            if(Integer.parseInt(numero) > 0) {
                System.out.println("Numero negativo no permitido");
                return -1;
            }
        }

        return resultado;
    }
}
