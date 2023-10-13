package Menghitung;

import java.util.Scanner;

public class LuasPersegiPanjang {
	public static void main(String[] args) {
		float Panjang, Luas, Tinggi;
		
		Scanner sc =new Scanner (System.in);
		System.out.print("Panjang; ");Panjang= sc.nextFloat();
		System.out.print("Tinggi; ");Tinggi= sc.nextFloat();
		
		Luas = Panjang * Tinggi;
		System.out.print("Luas" + Luas);
		
	}

}
