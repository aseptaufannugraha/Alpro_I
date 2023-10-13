package Menghitung;

import java.util.Scanner;

public class Segitiga {
	double alas,tinggi;
	
	void BacaSegitiga() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println(System.in);
		System.out.print("alas: ");alas=sc.nextFloat();
		System.out.print("tinggi: ");tinggi=sc.nextFloat();
	}
	
	void TulisSegitiga() {
		System.out.println("Segitiga: ");
		System.out.println("alas= "+alas+" tinggi= "+tinggi);
	}
	
	double Luas() {
	//	return (0.5*alas*tinggi);
		
		double L;
		L=0.5*alas*tinggi;
		return L;
	}
	
	public static void main(String[] args) {
		Segitiga S= new Segitiga();
		
		S.BacaSegitiga();
		S.TulisSegitiga();
		double L= S.Luas();
		System.out.println("Luas Segitiga: "+L);
		System.out.println("Luas Segitiga: "+S.Luas());
	}

}
