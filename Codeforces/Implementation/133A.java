import java.util.Scanner;






public class _118A {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();

if(s.contains("Q")||s.contains("H")||s.contains("9")) {
	System.out.println("YES");
}
else {
	System.out.println("NO");
}

sc.close();


	}

	
}
