package javaapplication2;


import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 000426145
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        System.out.println(""+run(x));
        
        
        
    }
    
    public static int run (int x)
    {
        int rta= x;
        boolean para = false;
        while(!para)
        {
            rta++;
           if(areDistinct(rta+""))
           {
                 para = true;      
           }
              
        }
        
        
        
        return rta;
    }
    
    
    public static boolean areDistinct(String num)
    {   boolean state = false;
        
        TreeSet arbol = new TreeSet();
        
        arbol.add(num.charAt(0));
        arbol.add(num.charAt(1));
        arbol.add(num.charAt(2));
        arbol.add(num.charAt(3));
         
        if (arbol.size()==4)
        {
            state= true;
        }
        return state;
    
        
    }
    
    
    
    
}
