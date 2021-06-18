package Odev6;
import java.util.Scanner;


public class Odev6 {
	public static void main(String[] args) {
		double kilo, boy, sonuc;
		Scanner inp = new Scanner(System.in);
		System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
		 
		boy = inp.nextDouble();
		
		System.out.print("Lutffen kilonuzu giriniz: ");
		kilo = inp.nextDouble();
		
		sonuc= kilo/(boy*boy);
		System.out.print("Vucut kitle endeksiniz: " + sonuc);
		
		
	}

}
