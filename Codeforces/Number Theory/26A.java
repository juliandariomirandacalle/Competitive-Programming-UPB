
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
                int x  = Integer.parseInt(sc.nextLine());
                
                

                System.out.println(run(x));
                
                
                
                
                
	}

	
	public static LinkedList descomponEnFactoresPrimosSuma(int valor)
	{           LinkedList <Integer> ints = new LinkedList<Integer>();
	
			int factor = 2;
			String rta ="";
			int factorLimite = (int)Math.sqrt(valor);
			
			while (factor <= factorLimite)
			{
				while (valor % factor == 0 )
				{
					ints.add(factor);
					valor = valor/factor;
				}
				
				if (factor==2)
                                {
					factor++;
                                }
				else
                                {
					factor+=2;
                                }
			}
			if (valor!=1)
			{
				ints.add(valor);
			}
			return ints;
		}
	public static String run(int num)
	{
          String rta ="";
          int contador =0;
            for (int i=2;i<= num;i++)
            {
                LinkedList lista = descomponEnFactoresPrimosSuma(i);
                

                    Iterator iter = lista.iterator();
                    TreeSet set = new  TreeSet();
                    while (iter.hasNext())
                    {  
                        set.add(iter.next());
                                
                          
                    }
                    if (set.size()==2)
                    {
                        contador++;
                    }
            }
                
        
            rta +=contador;
            
            
            return rta;
            
            
            
            
	}


}
