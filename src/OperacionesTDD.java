import java.util.Arrays;

public class OperacionesTDD {
    public static int sumarNumeros(String input) {
        int resultado = 0;

        if(input.equals("")) return 0;
        if(input.endsWith(",")) return -1;

        String[] numeros = input.split(",");
        for (String numero : numeros) {

            if(Integer.parseInt(numero) < 0) {
                System.out.println("Numero negativo no permitido");
                return -1;
            }

            if(Integer.parseInt(numero) > 1000) {
                System.out.println("Numero superior a 1000 ignorado");
                //ASDASDD
                continue;
            }
            resultado += Integer.parseInt(numero);
        }

        return resultado;
    }
}
