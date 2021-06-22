package odev16;
import java.util.Scanner;

public class Odev16 {
	public static void main(String[] args) {
		int year;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Yil Giriniz:");
		year = inp.nextInt();
		
		if((year %4 == 0) || (year % 400 ==0)) {
			System.out.print("Girdiginiz yil artik yildir.");
		}else {
			System.out.print("Girdiginiz yil artik yil degildir.");
		}
	}
}
