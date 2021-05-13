package arithmeticoperatons;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int r = sc.nextInt();
		double pi = 3.14;
		double perimeter = 2 * pi * r;
		double area = pi*r*r;
		System.out.println("Perimeter is: " + perimeter + "\nArea is: " + area);
		
		sc.close();
	}

}
