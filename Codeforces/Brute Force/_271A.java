package sdlgndfkn;
import java.util.*;
public class _271A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt()+1;
		String s=String.valueOf(num);
TreeSet<Character> c=new TreeSet<>();
while(true) {
	for (int i = 0; i < s.length(); i++) {
		c.add(s.charAt(i));
	}
	if(c.size()==s.length()) {
		break;
	}
	else {
		num++;
		s=String.valueOf(num);
		c.clear();
	}
	
}
System.out.println(s);
	}
	
	

}
