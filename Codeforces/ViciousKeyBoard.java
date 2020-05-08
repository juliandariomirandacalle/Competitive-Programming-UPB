package codefor;

import java.util.Scanner;

public class ViciousKeyBoard { //Problem 801A

    public static void main(String[] args) {
        Scanner tec;
        int longcad, cuentaVK = 0;
        String cad, sub;
        tec = new Scanner(System.in);
        Boolean cambio = false;

        cad = tec.nextLine();

        longcad = cad.length();

        for (int i = 0; i < longcad - 1; i++) {
            sub = cad.substring(i, i + 2);
            if (sub.equals("VK")) {
                cuentaVK++;
                i++;
            } else if (!cambio) {
                if (!sub.equals("KV")) {

                    if (i == longcad - 2) {
                        cuentaVK++;
                        i++;
                        cambio = true;

                    } else {
                        if (!cad.substring(i + 1, i + 3).equals("VK")) {
                            cuentaVK++;
                            i++;
                            cambio = true;
                        }

                    }
                }
            }
        }

        System.out.println(cuentaVK);

    }

}
