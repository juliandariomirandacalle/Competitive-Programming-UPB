
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 000426145
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int x = Integer.parseInt(sc.nextLine());
       String y = sc.nextLine();
       
       int contador =0;
       for (int i=0;i< y.length();i++)
       {
           if (y.charAt(i)=='8')
       {
           contador++;
       } 
       }
        
       
       
        System.out.println(run(contador, y.length()));
           
       
    }
    public static String run (int contador, int y)
    {
        String rta = "";
       
       
       if (y/11<=contador)
       {
           rta = y/11+"";
       }
       else if (y/11>contador)
       {
           rta = contador +"";
       }
    return rta;
    
}
}
