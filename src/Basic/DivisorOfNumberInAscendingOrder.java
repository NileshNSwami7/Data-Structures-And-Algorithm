package Basic;

import java.util.Scanner;

public class DivisorOfNumberInAscendingOrder {

	public static void divisorAscendingOrder(int num) {
		int i=0;
		for(i=1;i*i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		for(;i>=1;i--) {
			if((num%i==0) && (i!=num/i)) {
				System.out.println(num/i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		divisorAscendingOrder(num);
	}

}
