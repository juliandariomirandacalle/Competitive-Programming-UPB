import java.util.Scanner;

public class Main {

	
 public static void main(String[] args) {
	
	 
	 Scanner sc = new Scanner(System.in);
	 
	 int x = sc.nextInt();
	 
	 int y= run(x)+1;
	System.out.println(y); 
	 
	 
}	
 
 
 
 public static int run(int x)
 {
	 int contador =0;
	 
	 int temp =x;
	 while(temp/2!=0)
	 {
		 
		if(temp%2==1)
		{
			contador++;
		}
		
		temp/=2;
		 
		 
	 }
	 
	 
	 return contador;
	 	 
 }
	
	
}
