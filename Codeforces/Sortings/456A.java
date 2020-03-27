import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	boolean rta= false;
	int x = sc.nextInt();
	for(int i=0;i<x;i++ )
	{
     int y = sc.nextInt();
     int z = sc.nextInt();
     if(z>y)
     {
    	 rta=true;
    	 break;
     }
    
 
	}
	if(rta)
		
	{
		System.out.println("Happy Alex");
	}
	else if(!rta)
	{
System.out.println("Poor Alex");
		
	}

}



	


}