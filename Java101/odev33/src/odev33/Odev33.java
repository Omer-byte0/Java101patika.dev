package odev33;
import java.util.Scanner;
public class Odev33 {
	static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Sayi Giriniz: "); 
        int sayi = sc.nextInt();
        System.out.println(fibo(sayi));
    }
}
