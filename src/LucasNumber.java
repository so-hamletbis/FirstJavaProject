
public class LucasNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		int y=1;
		int z=3;
		System.out.println("First 10 numbers of the Lucas Numbers:");
		System.out.println(x);
		System.out.println(y);
		int p;
		while(z<=10)
		{
			p=x+y;
			System.out.println(p);
			x=y;
			y=p;
			z++;
		}

	}

}