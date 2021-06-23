package odev22;
import java.util.Scanner;

public class Odev22 {
	public static void main(String[] args) {
		int number,total=0;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Bir Sayi Giriniz: ");
		number = inp.nextInt();
		
		while(number !=0) {
			total += number%10;//Basamak rakamini bulmak icin
			number /= 10;// sayiyi azaltabilmek icin

		}
		System.out.print("Toplam:"+ total);
	}

}
