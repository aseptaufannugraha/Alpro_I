package BASIC;

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        float panjang, lebar, luas, keliling;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai panjang: ");
        panjang = input.nextFloat();
        System.out.print("Masukkan nilai lebar: ");
        lebar = input.nextFloat();

        // menghitung luas dan keliling persegi panjang
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        // menampilkan hasil perhitungan
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}
