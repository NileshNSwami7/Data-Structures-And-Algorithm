package Basic;

import java.util.Scanner;

public class BitwiseOnAndOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number:");
		int num = scan.nextInt();
		System.out.println("Give ith position");
		int i = scan.nextInt();
		
		int cmask = 1<< i;
		
		if((num & cmask)==0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}
	}

}
