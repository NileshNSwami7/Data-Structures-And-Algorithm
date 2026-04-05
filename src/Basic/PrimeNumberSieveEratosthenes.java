package Basic;

import java.util.Scanner;

public class PrimeNumberSieveEratosthenes {
	//1.Method
	/*public static void sievePrimeNumber(int n) {
		boolean prime[] = new boolean[n+1];
		
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				for(int j=i*2;j<=n;j=j+i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}*/
	
	//2.Method
	
	/*public static void sievePrimeNumber(int num) {
		boolean prime[]=new boolean[num+1];
		for(int i=2;i<=num;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=num;j=j+i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=num;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}*/
	
	public static void sievePrimeNumber(int num) {
		boolean prime[] = new boolean[num+1];
		for(int i=2;i*i<=num;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=num;j=j+i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=num;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		sievePrimeNumber(num);
	}

}
