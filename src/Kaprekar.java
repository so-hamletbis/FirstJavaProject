
public class Kaprekar {
	static boolean kaprekar(int n)
    {   
        if (n == 1)
           return true;
        int sq = n * n;
        int count_digits = 0;
        while (sq != 0)
        {
            count_digits++;
            sq /= 10;
        }
        sq = n*n;
        for (int digit=1; digit<count_digits; digit++)
        {
             int eq = (int) Math.pow(10, digit);
            if (eq == n)
                continue;
             int sum = sq/eq + sq % eq;
             if (sum == n)
               return true;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<1000; i++) {
			int j=i*i;
            if (kaprekar(i))
            {
                 System.out.print(i + " ");
				 System.out.println(j + " ");
            }
		}
	}

}