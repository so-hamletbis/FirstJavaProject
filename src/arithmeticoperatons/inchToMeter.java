package arithmeticoperatons;

import java.util.Scanner;

public class inchToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length in inches");
		float inch=sc.nextFloat();
		
		float meter=(float)(inch/39.37);
		System.out.println(inch+" inch = "+meter+" meter");
		
		sc.close();
	}
}
