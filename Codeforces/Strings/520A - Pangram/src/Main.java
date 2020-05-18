import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        String text = scan.next();

        String yesno = "";
        String textup = text.toUpperCase();
        char abc[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        if (len<26)
        {
            yesno = "NO";
        }
        else
        {
            int cont = 0;

            for (char i:abc)
            {
                boolean contenedor = textup.contains(Character.toString(i));

                if (contenedor)
                {
                    cont++;
                }

            }

            if (cont >= 26)
            {
                yesno = "YES";
            }
            else
            {
                yesno = "NO";
            }

        }

        System.out.println(yesno);
    }
}