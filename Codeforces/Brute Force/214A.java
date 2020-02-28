
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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nums = sc.nextLine().split(" ");
        
        int x = Integer.parseInt(nums[0]);
        int y = Integer.parseInt(nums[1]);
         
        
        System.out.println(run(x,y)+"");
        
        
        
    }
    
    
    public static int run(int x, int y)
    {
        
       int mayor =0;
       int contador=0;
       
       if (x>=y)
       {
           mayor  =x;
       }
       else if (y>x)
       {
           mayor =y;
       }
       
       
       
       for (int i=0; i<mayor+1;i++)
       {
           for (int j=0;j<mayor+1;j++)
           {
               if ((i*i+j==x)&&(i+j*j==y))
                       {
                           contador++;
                       }
           }
                   
       }
       return contador;
       
        
        
    }
    
}
