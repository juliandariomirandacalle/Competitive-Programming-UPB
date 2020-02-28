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
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        
        System.out.println(run(x)+"");
       
    }
    
    public static long run(long x)
    {
         long temp= x+1;
         long contador =1;
         boolean para = false;
         while(!para)
         {
             
         
         if (!(temp+"").contains("8"))
         {
             contador ++;
             temp++;
         }
         
         else if ((temp+"").contains("8"))
         {
             para = true;
         }
         }
         
         return contador;
        
        
        
    }
    
}
