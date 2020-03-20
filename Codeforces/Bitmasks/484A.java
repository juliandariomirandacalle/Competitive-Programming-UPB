import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int n;
	
		long l;
		long r;
		long nw;
		n = sc.nextInt();
		int i = 0;
		int sz;

		while ((n--) != 0)
		{
			i = 0;
			l = sc.nextLong();
			r = sc.nextLong();
			sz = (int) (Math.log(r) / Math.log(2));
			while (l <= r)
			{
				if ((l & (1l << i)) == 0)
				{
					nw = l | (1l << i);
					if (nw <= r)
					{
						l = nw;
					}
					else
					{
						break;
					}
				}

				i++;
			}

			System.out.print(l);
			System.out.print("\n");
		}
		
		
		
		
		
				
				
	}
		
}
