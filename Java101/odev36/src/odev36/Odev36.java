package odev36;
import java.util.Scanner;

public class Odev36 {
	 static boolean isPrime(int n, int i)
	    {
	        if (n <= 2)
	            return (n == 2) ? true : false;
	        if (n % i == 0)
	            return false;
	        if (i * i > n)
	            return true;

	        return isPrime(n, i + 1);
	    }
	    public static void main(String[] args)
	    {
	        int n;

	        Scanner inp = new Scanner(System.in);
	        System.out.print("Say� Giriniz : ");
	        n= inp.nextInt();

	        if (isPrime(n, 2))
	            System.out.print(n+" "+"sayisi asaldir !");
	        else
	            System.out.print(n+" "+"sayisi asal degildir !");
	    }

}
