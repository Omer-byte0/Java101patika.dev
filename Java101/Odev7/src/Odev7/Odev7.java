package Odev7;
import java.util.Scanner;

public class Odev7 {
	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican, toplam;
		double armtKgFiyat=2.14,elmaKgFiyat=3.67,dmtsKgFiyat=1.11, muzKgFiyat=0.95, ptlcnKgFiyat=5;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Armutun kilosu:");
		armut = inp.nextDouble();
		
		System.out.print("Elmanin kilosu:");
		elma = inp.nextDouble();
		
		System.out.print("Domates kilosu:");
		domates = inp.nextDouble();
		
		System.out.print("Muz kilosu:");
		muz = inp.nextDouble();
		
		System.out.print("Patlican kilosu:");
		patlican = inp.nextDouble();
		
		System.out.println("");
		toplam = (armut*armtKgFiyat) + (elma*elmaKgFiyat) + (domates*dmtsKgFiyat) + (muz*muzKgFiyat) + (patlican*ptlcnKgFiyat);
		System.out.print("Toplam Tutar:" + toplam);
		
	}
	
}
