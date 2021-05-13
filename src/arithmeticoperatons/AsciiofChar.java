package arithmeticoperatons;

import java.util.Scanner;

public class AsciiofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch= sc.next().charAt(0);
		
		int ascii= ch;
		System.out.println("The ASCII value of " + ch + " is " + ascii);
		
		sc.close();
	}

}
