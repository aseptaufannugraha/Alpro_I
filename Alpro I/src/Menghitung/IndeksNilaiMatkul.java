package Menghitung;

import java.util.Scanner;

public class IndeksNilaiMatkul {
	   public static String hitungIndeksNilai(int nilai) {
	      if (nilai >= 81 && nilai <= 100) {
	         return "A";
	      } else if (nilai >= 76 && nilai <= 80) {
	         return "AB";
	      } else if (nilai >= 56 && nilai <= 75) {
	         return "B";
	      } else if (nilai >= 51 && nilai <= 55) {
	         return "BC";
	      } else if (nilai >= 41 && nilai <= 50) {
	         return "C";
	      } else if (nilai >= 21 && nilai <= 40) {
	         return "D";
	      } else if (nilai >= 0 && nilai <= 20) {
	         return "E";
	      } else {
	         return "Nilai di luar jangkauan";
	      }
	   }
	
	  
	   public static void main(String[] args) {
		   IndeksNilaiMatkul indeks = new IndeksNilaiMatkul();
		   Scanner sc = new Scanner(System.in);
		      
		   int nilai = 77;
		   System.out.println(nilai + " " + indeks.hitungIndeksNilai(nilai));
		      
		   nilai = 110;
		   System.out.println(nilai + " " + indeks.hitungIndeksNilai(nilai));
		      
		   System.out.println("{kosong} " + ("Nilai harus diisi"));
		      
		   nilai = 25;
		   System.out.println(nilai + " " + indeks.hitungIndeksNilai(nilai));
		  }

	 }

		    
