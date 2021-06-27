package odev32;
import java.util.Scanner;

public class Odev32 {
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
        int r, sum=0, a, n;
        System.out.print("Bir Deger Giriniz:");
         n = inp.nextInt();
         a=n;
        while(n != 0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(a == sum) {
            System.out.print("Palindrom Sayý. ");
        }else if(a != sum) {
            System.out.print("Palindrom deðil.");
        }
    }
           
}
