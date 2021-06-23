package odev20;
import java.util.Scanner;

public class Odev20 {
	public static void main(String[] args) {
		int n, r, x, nFaktor=1, rFaktor=1, farkFaktor=1;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("C(n,r) Olacak Sekilde; ");
		
		System.out.print("'n' Degerini Giriniz: ");
		n = inp.nextInt();
		
		System.out.print("'r' Degerini Giriniz: ");
		r = inp.nextInt();
		
		for(int i=1; i<=n; i++) {
			nFaktor *= i;
		}
		for(int j=1; j<=r; j++) {
			rFaktor *= j;
		}
		
		x = n - r;
		
		for(int l=1; l<=x; l++) {
			farkFaktor *= l;
		}
		
		double C = nFaktor / (rFaktor*(farkFaktor));
		System.out.print("C("+n+ "," +r+") =" +C);
	
	}

}
