package Basic;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class PrimeFactorialNumbers {
	
	//1.method time complexity O(n) in this method if the number is priem then the number of iteration is maximun 
	/*
	public static void primeFactorial(int num) {
		int i=2;
		while(num>1) {
			while(num%i==0) {
				System.out.println(i);
				num=num/i;
			}
			i++;
		}
		
	}*/
	//2. Method this will reduce the number of iterations O(root(n))
	public static void primeFactorial(int num) {
		
		int i=2;
		 while(i*i<=num) {
			 while(num%i==0) {
				 System.out.println(i);
				 num=num/i;
			 }
			 i++;
		 }
		if(num>1) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		primeFactorial(num);
	}

}
