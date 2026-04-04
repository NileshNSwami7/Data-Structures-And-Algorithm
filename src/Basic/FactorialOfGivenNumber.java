package Basic;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	
	public static int factorial(int n) {
		int ans=1;
		for(int i=2;i<=n;i++) {
			ans = ans*i;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(factorial(num));
		
	}

}
