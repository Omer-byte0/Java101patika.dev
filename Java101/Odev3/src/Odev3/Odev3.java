package Odev3;
import java.util.Scanner;

public class Odev3 {
	public static void main(String[] args) {
		int a,b,c;
		double u,alan,alaninKaresi;
		Scanner girdi = new Scanner(System.in);
		System.out.print("1. Kenari Giriniz:");
		a = girdi.nextInt();
		System.out.print("2. Kenari Giriniz:");
		b = girdi.nextInt();
		System.out.print("3. Kenari Giriniz:");
		c = girdi.nextInt();
	    
		u=((a+b+c)/2);
		alaninKaresi = (u*(u-a)*(u-b)*(u-c));
		alan = Math.sqrt(alaninKaresi);
		System.out.print("Ucgenin Alani:" + alan);
		}
	

}
