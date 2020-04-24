
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TheEternalImmortality {

    public static void main(String[] args) throws IOException {
        BufferedReader digitado = new BufferedReader(new InputStreamReader(System.in));
        String linea = digitado.readLine();
        String[] entrada = linea.split(" ");
        long entradaA = Long.parseLong(entrada[0]);
        long entradaB = Long.parseLong(entrada[1]);
        BigInteger salida = BigInteger.ONE;
        long ciclo;
        // Manual
        for (ciclo = entradaB; ciclo > entradaA; ciclo--) {
            salida = salida.multiply(BigInteger.valueOf(ciclo));
        }
        System.out.println(salida.mod(BigInteger.TEN));
    }

}
