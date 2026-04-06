package Basic;

import java.util.Scanner;

public class DivisorOfGivenNumber {
	
	//1.Method brut force time complexity O(n)
	
	/*public static void divisorNumber(int num) {
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}*/
	
	//2.Method where time complexity become O(root n)
	
	public static void divisorNumber(int num) {
		for(int i=1;i*i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				if(i != num/i ) {
					System.out.println(num/i);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		divisorNumber(num);
	}

}
