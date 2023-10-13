package Menghitung;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, total = 0;
		
		System.out.print("Masukan nilai N: ");
		n = input.nextInt();
		
		if(n <= 0) {
			System.out.println("N tidak boleh nol atau minus");
		} else {
			System.out.println("Masukan "+n+" bilangan:");
			for(int i = 1; i <= n; i++) {
				total += input.nextInt();
			}
			
			System.out.println("Total= "+total);
		}
		
	}

}
