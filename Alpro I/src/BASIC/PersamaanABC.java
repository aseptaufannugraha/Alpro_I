package BASIC;

import java.util.Scanner;

public class PersamaanABC {

	public static void main(String[] args) {
		// Deklarasi Variabel
		int a, b, c;
		double D, x1, x2;
		
		Scanner sc = new Scanner(System.in);
		// Input Nilai
		System.out.print("A = "); a = sc.nextInt();
		System.out.print("B = "); b = sc.nextInt();
		System.out.print("C = "); c = sc.nextInt();
		
		// Rumus Diskriminan
		D = Math.pow(b, 2) - 4 * a * c;
		
		// Pengulangan
		if(D >= 0) {
			x1 = (-b + Math.sqrt(Math.pow(b, 2)-4 * a * c)) / 2 * a;
			x2 = (-b + Math.sqrt(Math.pow(b, 2)-4 * a * c)) / 2 * a;
			System.out.println("Nilai X1= "+x1);
			System.out.println("Nilai X2= "+x2);
		}
		
		else {
			System.out.println("Persamaan tidak mempunyai akar-akar real");
		}
	}

}
