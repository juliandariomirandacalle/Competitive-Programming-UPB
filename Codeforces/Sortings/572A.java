
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tamano1 = sc.nextInt();
		int tamano2=sc.nextInt();
		int k=sc.nextInt();
		int m = sc.nextInt();
		
		int [] arreglo1 = new int[tamano1];
		for(int i=0;i<arreglo1.length;i++)
		{
			arreglo1[i]= sc.nextInt();
		}
		int [] arreglo2 = new int[tamano2];
		
		for(int i=0;i<arreglo2.length;i++)
		{
			arreglo2[i]= sc.nextInt();
		}
	
		if(arreglo2[tamano2-m]>arreglo1[k-1])
		{
			System.out.println("YES");	
		}
		else
		{

			System.out.println("NO");	
		}
		
		
		}



}
