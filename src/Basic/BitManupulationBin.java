package Basic;

import java.util.Scanner;

public class BitManupulationBin {
	
	public static String decimalToBinary(int num) {
		String binary="";
		int reminder=0;
		while(num>=1) {
			reminder = num%2;
			num = num/2;
			binary = reminder + binary;
		}
		return binary;
	}
	
	public static int binaryToDecimal(String binary) {
		
		int result = 0;
		int powerOf2 = 1;
		
		for(int i=binary.length()-1 ; i>=0; i--) {
			
			if(binary.charAt(i) == '1') {
				result = result + powerOf2;
			}
			powerOf2 = powerOf2 * 2;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String binary = decimalToBinary(num);
		System.out.println("Decimal to Binary : "+ binary);
		System.out.println("Binary to Decimal : "+binaryToDecimal(binary));
	}

}
