import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = Integer.parseInt(scan.nextLine());
        String salida = "";

        for (int i = 0; i < casos; i++) {

            int grado = Integer.parseInt(scan.nextLine());


            double lado = 360 / (180 - (double)grado);
            int grado2 =  ((180 * ((int)lado - 2)) / (int)lado);


            if (grado2 == grado) {
                System.out.println("YES");

            } else {
                System.out.println("NO");

            }
        }


        System.out.println(salida);

    }
}

