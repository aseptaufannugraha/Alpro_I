package Menghitung;

import java.util.Scanner;

public class BeratBadanDanTinggiBadan {
	public static void main(String[] args) {
		float Bb, Tb, Bmi = 30;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Bb= ");Bb = sc.nextInt();
		System.out.print("Tb= ");Tb = sc.nextInt();
		
		if (Bmi< 18.5) {
			System.out.print("(berat badan kurus)");
		}else if  (Bmi<=22.9) {
			System.out.print("(berat badan normal)");
		}else if (Bmi<24.9) {
			System.out.print("(berat badan berlebihan)");
		}else {
			System.out.println("(berat badan obesitas)");
		}
	}

}
