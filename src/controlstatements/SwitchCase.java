package controlstatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		char c='y';
		int sumOfArr=0,mulOfArr=1;
		int[] array = new int[5];
		do {
			System.out.println("Enter the choice");
			System.out.println("R - Reading the Array Values");
			System.out.println("P - Printing the Array Values");
			System.out.println("S - Sum of Array Values");
			System.out.println("M - Multiplication Array Values");
			char choice = input.next().trim().charAt(0);
			switch(choice) {
			case 'R':
				System.out.println("Enter the array values");
				for(int i=0;i<array.length;i++) {
					array[i]=input.nextInt();
				}
				break;
			case 'P':
				System.out.println("Array values");
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
				}
				break;
			case 'S':
				System.out.println("Sum of Array");
				for(int i=0;i<array.length;i++) {
					sumOfArr+=array[i];
				}
				System.out.println(sumOfArr);
				break;
			case 'M':
				System.out.println("Multi of Array");
				for(int i=0;i<array.length;i++) {
					mulOfArr*=array[i];
				}
				System.out.println(mulOfArr);
				break;
			}
			System.out.println("Do you want to continue?");
			c = input.next().trim().charAt(0);
		}while(c=='y');
		input.close();
	}

}
