package arithmeticoperatons;

import java.util.Scanner;

public class RectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int b=sc.nextInt();
		
		int area=l*b;
		int peri=l+b;
		System.out.println("Perimeter of the rectangle is ="+peri);
		System.out.println("Area of the rectangle is ="+area); 
		
		sc.close();
	}

}
