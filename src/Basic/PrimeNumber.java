package Basic;

import java.util.Scanner;

public class PrimeNumber {
	
	// Brut force algorithm having O(n) time complexity
	
	/*
	  public static boolean isNumberPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	*/
	
	//2.Method Time complexity O(root(n))
	/*
	public static boolean isNumberPrime(int num) {
		
		//you can also use built-in function Math.sqrt(num)
		for(int i=2; i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	*/
	
	//3.Method Time complexity O(root(n))
	public static boolean isNumberPrime(int num) {
		if (num==1) {
			return false;
		}
		if((num == 2) || (num == 3)) {
			return true;
		}
		if((num%2==0)||(num%3==0)) {
			return false;
		}
		for(int i=5;i<=Math.sqrt(num);i=i+6) {
			if((num%i==0)||(num%i+2==0)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(isNumberPrime(n)){
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
