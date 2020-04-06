import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int año = esc.nextInt()+1;

        String añostr = String.valueOf(año);


        int cont = 0;

        while(cont == 0)
        {
            List<Integer> separado = new ArrayList<>();
            for (int i = 0; i < añostr.length(); i++) {

                separado.add(Character.getNumericValue(añostr.charAt(i)));
            }


            Set<Integer> repetidos = new HashSet<>(separado);
            separado.clear();
            separado.addAll(repetidos);

            if (añostr.length() != repetidos.size())
            {
                año++;
                añostr = String.valueOf(año);
            }
            else
            {
                System.out.println(año);
                break;
            }
        }


    }
}
