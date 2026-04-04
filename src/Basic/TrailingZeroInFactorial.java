package Basic;

import java.util.Scanner;

public class TrailingZeroInFactorial {
	
	public static int trailingZeros(int n) {
		int res=0;
		int powerOf5= 5;
		while(n>=powerOf5) {
			
			res+=n/powerOf5;
			powerOf5 = powerOf5 * 5;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Number of Zeros in trailing : "+trailingZeros(num));

	}

}
