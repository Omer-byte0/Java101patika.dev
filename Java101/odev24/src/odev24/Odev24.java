package odev24;
import java.util.Scanner;

public class Odev24 {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Deger Giriniz :");
        int n = inp.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        for(int a=(n-1); a>=1; a--) {
        	for(int b=(n-a)-1; b>=0; b--) {
        		System.out.print(" ");
        	}
        	for(int c=(2*a)-1; c>=1; c--) {
        		System.out.print("*");
        	}
        	System.out.println(" ");
        }
	}
}
	