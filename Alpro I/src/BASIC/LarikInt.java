package BASIC;

import java.util.Scanner;

public class LarikInt {

	public static void main(String[] args) {
		int N = 7;
		int []a = new int[N];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N; i++) {
			a[i]=0;
		}
		
		System.out.println("Menginput element-element array");
		for (int i=0; i<N; i++) {
			System.out.print("Data ke "+i); a[i] = sc.nextInt();
		}
		
		System.out.println("Menampilkan isi/elemen array");
        for (int i=0; i<N; i++) {
            System.out.println("Data ke "+i); a[i] = sc.nextInt();
        }

	}

}
