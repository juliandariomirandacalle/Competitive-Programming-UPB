/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author 000426145
 */
public class JavaApplication3 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        int x = Integer.parseInt(sc.nextLine());
        String cases = sc.nextLine();
        String [] nums = cases.split(" ");
        ArrayList arrayListInt = new ArrayList<>();
        
        
        for(int i=0;i< nums.length;i++)
        {
            arrayListInt.add(Integer.parseInt(nums[i]));
        }   
       
         System.out.println(run(arrayListInt)+"");
           
        
    }
     
     public static int run(ArrayList lista)
     
     {
       int contador =0;
       int mejor =(int)lista.get(0);
       
       int peor = (int)lista.get(0);
       for (int i=1;i<lista.size();i++)
       {
           if ((int)lista.get(i)>mejor)
           {
               mejor= (int)lista.get(i);
               contador++;
           }
           else if ((int)lista.get(i)<peor)
           {
               peor=(int)lista.get(i);
               contador ++;
           }
       }
       return contador;
       
     }
    
}


