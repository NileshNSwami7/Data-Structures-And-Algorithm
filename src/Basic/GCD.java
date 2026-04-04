package Basic;

import java.util.Scanner;

public class GCD {
	
	// this is Brut force algorithm having time complexity O(n)
	public static int gcd(int a, int b) {
		int num = 0;
		int min = Math.min(a, b);
		
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				num=i;
			}
		}
		return num;
	}
	//Eclid's Algorithm
	public static int euclidGcd(int a,int b) {
		
		while(a != b) {
			if(a>b) {
				a-=b;
			}else {
				b-=a;
			}
		}
		return a;
	}
	
	//Optimal approach of Euclid's Algorithm 
	
	public static int optEuclidGcd(int a,int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a%=b;
			}else {
				b%=a;
			}
		}
		if(a!=0) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Brut force algorithm: "+gcd(a,b));
		System.out.println("Euclid's Algorithm: " + euclidGcd(a,b));
		System.out.println("Optimal approach of Euclid's Algorithm: "+optEuclidGcd(a, b));
	}

}
