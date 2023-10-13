package Menghitung;

import java.util.Scanner;

public class PersegiPanjang {
	float panjang;
	float lebar;
	
	double hitungLuas() {
		return panjang * lebar;
	}
	
	double hitungKeliling() {
		return 2 * (panjang + lebar);
	}
	
	void tampil() {
		System.out.println("Panjang: "+panjang);
		System.out.println("Lebar: "+lebar);
		System.out.println("Luas: "+hitungLuas());
		System.out.println("Keliling: "+hitungKeliling());
	}
	
    public static void main(String[] args) {
        float panjang, lebar, luas, keliling;
        
        // untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in); 
        
        // untuk memasukan nilai panjang
        System.out.print("panjang: ");
        panjang = input.nextFloat();
        
        // untuk memasukan nilai lebar
        System.out.print("lebar: ");
        lebar = input.nextFloat();

        // menghitung luas dan keliling persegi panjang
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        // menampilkan hasil perhitungan
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
        
    }
}