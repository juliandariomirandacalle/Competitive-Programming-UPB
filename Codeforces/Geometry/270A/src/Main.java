import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for (int i = 0; i <casos ; i++) {
            double a = scan.nextInt(); //angle alpha
            double n = 360/(180-a); //numero de aristas
            int nInt = (int)n;
            if((n-nInt) != 0)//si no es un entero
            {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
