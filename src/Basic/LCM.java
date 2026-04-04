package Basic;

import java.util.Scanner;

public class LCM {
	
	//Brut force algorithm 
	public static int lCm(int a,int b) {
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a==0 && res%b==0) {
				break;
			}
			res++;
		}
		return res;
	}
	
	//Euclid's Algorithm
	public static int euclidLcm(int a,int b) {
		return (a*b)/euclidGcd(a,b);
	}
	public static int euclidGcd(int num1,int num2) {
		
		while (num1!=0 && num2!=0) {
			if(num1>num2) {
				num1%=num2;
			}else {
				num2%=num1;
			}
		}
		if(num1!=0) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Brut force Algorithm: "+lCm(a,b));
		
		System.out.println("Euclid algorithm: "+euclidLcm(a,b));

	}

}