/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author 000426145
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        
        System.out.println(run(x));
        
    }

    
    public static String run(int n)
    {  String rta ="";
      if (n ==1)
       {
          rta="9 8";
       }
      else
          
      {
          rta = n*6+" "+n*5;
      }      
       return rta; 
       //
    }
    
    
    
}
