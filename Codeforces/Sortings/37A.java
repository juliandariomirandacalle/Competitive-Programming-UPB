import java.util.Scanner;

public class Main {
   
	
	
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	
	int [] arreglos = new int [1001];
	
	for(int i=0;i<x;i++)
	{
		arreglos[sc.nextInt()]+=1;
	}
	
	int mayor = arreglos[0];
	
	int numero=0;
	
	for(int i=0; i< arreglos.length;i++)
	{
		if(arreglos[i]>=mayor)
		{
			mayor = arreglos[i];
		}
	}
	
	

	for(int i=0; i< arreglos.length;i++)
	{
		if(arreglos[i]!=0)
		{
			numero++;
		}
	}
	System.out.println(mayor+" "+numero);
	
	}
	
	
	
	
	
}
