package Basic;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	// This is brute force approach which has time complexity O(n)
	
	public static int SumOfNumber(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {              
			sum = sum + i;
		}
		return sum;
	}
	
	//There is One more approach to find to calculate the sum  with the help of formula
	
	public static int formulaMethod(int n) {
		
		int sum=0;
		
		sum = n * (n+1)/2 ; 
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("Brut force method : "+SumOfNumber(num));
		System.out.println("Formula mrthod :" + formulaMethod(num));
	}

}
