package Odev10;
import java.util.Scanner;

public class Odev10 {
	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		int m, f, t, k, mu;

		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Notunu Giriniz: ");
		m = inp.nextInt();
		if(m>0 && m <= 100) {
			mat = m;
		}
		else {
			System.out.println("Verilen aralikta deger giriniz !");
			return;
		}
	
		
		System.out.print("Fizik Notunu Giriniz: ");
		f = inp.nextInt();
		
			if(f>0 && f<= 100) {
				fizik = f;
			}
			else {
				System.out.println("Verilen aralikta deger giriniz !");
				return;
			}
		
		
		System.out.print("Turkce Notunu Giriniz: ");
		t = inp.nextInt();
			if(t>0 && t <= 100) {
				turkce = t;
			}
			else {
				System.out.println("Verilen aralikta deger giriniz !");
				return;
			}
		
		System.out.print("Kimya Notunu Giriniz: ");
		k = inp.nextInt();
			if(k>0 && m <= 100) {
				kimya = k;
			}
			else {
				System.out.println("Verilen aralikta deger giriniz !");
				return;
			}
		
		System.out.print("Muzik Notunu Giriniz: ");
		mu = inp.nextInt();
			if(mu>0 && mu <= 100) {
				muzik = mu;
			}
			else {
				System.out.println("Verilen aralikta deger giriniz !");
				return;
			}
		
		
			
			double ort = (m+f+t+k+mu)/5;
			
			if(ort >= 55) {
				System.out.print("Sinifi" + " " + ort + " " + "ortalama ile gectiniz.");
			}
			else {
				System.out.print("Sinifta" + " " + ort + " " + "ortalama ile kaldiniz.");
			}
			
			
		}
	

}
