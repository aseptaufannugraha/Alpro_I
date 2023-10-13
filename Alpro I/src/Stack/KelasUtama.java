package Stack;

import java.util.Scanner;

public class KelasUtama {

	public static void main(String[] args) {
		Operasi op =  new Operasi();
		Scanner sc = new Scanner(System.in);
		int pilihan;
		
		System.out.println("Selamat Datang...");
		System.out.println("Daftar Menu");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Jumlah data Stack");
		System.out.println("4. Tampil  Data");
		System.out.println("5. Keluar");
		
		do {
			System.out.print("Menu pilihan anda: ");
			pilihan = sc.nextInt();
			
            switch (pilihan) {
            case 1:
                System.out.print("Masukkan data baru: ");
                int dataDepan = sc.nextInt();
                op.push(dataDepan);
                break;
            case 2:
                System.out.print("Masukkan data baru: ");
                int dataAkhir = sc.nextInt();
                op.pop(dataAkhir);
                break;
            case 3:
                op.tampilData();
                break;
            case 4:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

		} while(pilihan !=4);

	}

}
