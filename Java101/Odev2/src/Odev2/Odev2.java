package Odev2;
import java.util.Scanner;
public class Odev2 {
	public static void main(String[] args) {
		double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvTutar, kdvliTutar;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Ucret Tutarini Giriniz: ");
		tutar = inp.nextDouble();
		if(tutar > 0 && tutar <= 1000) {
			
			System.out.println("KDV'siz Tutar:" + tutar);
			
			kdvTutar = tutar * kdvOran1;
			System.out.println("KDV Tutari:" + kdvTutar);
			
			kdvliTutar = tutar + kdvTutar;
			System.out.println("KDV'li Tutar:" + kdvliTutar);
			
			System.out.println("KDV Oraný:" + kdvOran1);
			
		}
		else if(tutar>1000) {
			
			System.out.println("KDV'siz Tutar:" + tutar);
			
			kdvTutar = tutar * kdvOran2;
			System.out.println("KDV Tutari:" + kdvTutar);
			
			kdvliTutar = tutar + kdvTutar;
			System.out.println("KDV'li Tutar:" + kdvliTutar);
			
			System.out.println("KDV Oraný:" + kdvOran2);
		}
		
	}

}
