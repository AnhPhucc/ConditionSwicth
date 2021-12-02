package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10.1
		System.out.println("Nhap so tu nhien a =");
		int a = sc.nextInt();
		switch(a) {
		case 0:
		}
		//10.2
		System.out.println("Nhap so tu nhien n =");
		int n = sc.nextInt();
		switch(n) {
		case 15:
			System.out.println("So chia het cho 3");
		    break;
		case 20:
			System.out.println("So chia het cho 5");
			break;
	    }
		//10.3
		System.out.println("Nhap vao thang trong nam n =");
		int t = sc.nextInt();
		switch(t) {
		case 1, 3, 5, 7, 8, 10, 12:
		System.out.println("Thang co 31 ngay");
		break;
		case 4,6,9,11:
		System.out.println("Thang co 30 ngay");
		break;
		case 2:
		System.out.println("Thang co 28 ngay");
		break;
		}
		//10.4
		Scanner scpt = new Scanner(System.in);
		System.out.println("nhap he so bac 2 b = " );
		float b = scpt.nextFloat();
		System.out.println("nhap he so bac 1 c = " );
		float c = scpt.nextFloat();
		System.out.println("nhap he so tu do d = ");
		float d = scpt.nextFloat();
		
    }
}