package odev19;

import java.util.Scanner;

public class Odev19 {
	public static void main(String[] args) {
		int number;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Bir Sayi Giriniz:");
		number = inp.nextInt();
		
		for(int i=1; i<=number; i*=4) {
			System.out.println("Dördün Katlari:" + " " + i);
			}
		System.out.print("\n");
		for(int j=1; j<=number; j*=5) {
			System.out.println("Besin Katlari:" + " " +j);
		}
	}
}
