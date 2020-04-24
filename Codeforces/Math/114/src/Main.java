import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger k = BigInteger.valueOf(sc.nextInt());
        BigInteger l = BigInteger.valueOf(sc.nextInt());

        BigInteger temp = k;
        int cont = 0;

        while (temp.compareTo(l)==-1){
            temp = temp.multiply(k);
            cont++;
        }

        if(temp.compareTo(l)==0){
            System.out.println("YES");
            System.out.println(cont);
        }else{
            System.out.println("NO");
        }

    }
}
