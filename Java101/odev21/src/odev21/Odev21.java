package odev21;
import java.util.Scanner;

public class Odev21 {
	public static void main(String[] args) {
		int n, k, total=1;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Ussu Alinacak Sayi:");
		n = inp.nextInt();
		
		System.out.print("Derecesi:");
		k = inp.nextInt();
		
		for(int i=1; i<=k; i++){
			total = total * n;
		}
		System.out.print("Sonuc:" + total);
	}

}
