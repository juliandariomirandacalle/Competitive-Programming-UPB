
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
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
                String input = sc.nextLine();
                String [] nums = input.split(" ");
                
                String x = nums [0];
                String y = nums [1];
                
                if(y.equals("1"))
                {
                    System.out.println(x);
                  
                }
              
                else
                {
                    
                
                System.out.println(run(x));
                }
                
                
                
                
                
                    
                
	}

	
	public static String run(String y)
        {String rta ="";
        BigInteger bi = new BigInteger(y); 
        double contador= Math.log(bi.doubleValue()) / (Math.log(2));
           
        
            System.out.println(contador);
        
        if(contador%1<0.000000001&&contador%1!=0)
        {
            contador--;
        }
       
        int contador1= (int)contador;
          
         
            
        for (int i=0;i<contador1+1;i++)
        {
            
            rta+="1";
            
            
        }
            
        return  aDecimal(rta);
        
        }
        
        public static String  aDecimal(String baseO) {

		String base = baseO;

		BigInteger rta = new BigInteger("0");
              
		for (int i=0;i<base.length();i++ )
		{       BigInteger temp = new BigInteger((base.charAt(i)+""));
                        BigInteger temp1 = new BigInteger(potencia(2,base.length()-1-i)+"");
                
                        BigInteger temp2 = temp.multiply(temp1);
            
			rta=rta.add(temp2);
		}
               
		return  rta+"";	
	}
        public static long potencia(int a, int b){
		long resultado = 1;
		for (int i = 1; i<=b; i++) {
			resultado = resultado *a;
		}

		return resultado;
	}
}
