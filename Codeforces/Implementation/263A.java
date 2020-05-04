import java.util.Scanner;

public class sdf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont=1;
		for(int i=1;i<=5;i++){
			
		int num=sc.nextInt();
		if(num==1){
		int resta1=i-3;
		int resta2=cont-3;
		if(resta1<0){
		resta1=3-i;
		}
		if(resta2<0){
		resta2=3-cont;
		}
		System.out.println(resta1+resta2);
		break;
		}
		
		
		if(cont==5 && i==5){
		System.out.println(4);
		break;}
		
		if(i==5){
		i=0;
		cont++;
		}
		 
		}
		 
		 
		 
		 
		 
		sc.close();
		 

	}

}
