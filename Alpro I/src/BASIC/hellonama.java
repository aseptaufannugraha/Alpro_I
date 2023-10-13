package BASIC;

import java.util.Scanner;

public class hellonama {
//	String Nama
//	Input (Nama)
//	Output("hello ", Nama)
	
	public static void main(String[] args) {
		String Nama;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nama: "); Nama = sc.nextLine();
		System.out.print("Hello "+Nama);

	}

}
