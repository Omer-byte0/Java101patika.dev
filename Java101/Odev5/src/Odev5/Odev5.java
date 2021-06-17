package Odev5;
import java.util.Scanner;

public class Odev5 {
	public static void main(String[] args) {
		int r, tamAci=360;
		double pi=3.14, alan,sonuc,alfa;
		Scanner inp = new Scanner(System.in);
		System.out.print("Yaricapi giriniz:");
		r = inp.nextInt();
		
		System.out.print("Aci Giriniz: ");
		alfa = inp.nextDouble();
		
		alan = pi*r*r;
		System.out.println("Dairenin alani:" + alan);
		sonuc = ((pi*(r*r)*alfa)/tamAci);
		System.out.print("Daire Dilimi: " + sonuc);
	}

}
