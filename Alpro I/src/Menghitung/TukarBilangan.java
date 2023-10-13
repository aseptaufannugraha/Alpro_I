package Menghitung;

import java.util.Scanner;

public class TukarBilangan {
	public static void main(String[] args) {
		int A, B;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("A : ");A = sc.nextInt();
		System.out.print("B: ");B = sc.nextInt();
		// misal A=5, B=7
		A = A + B; // A=12
		B = A - B; // B=5
		A = A - B; // A=7
		
		System.out.println("A= "+A);
		System.out.println("B : "+B);
	}

}
