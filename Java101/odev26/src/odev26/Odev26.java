package odev26;
import java.util.Scanner;

public class Odev26 {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2;
        int x, y, i, ebob = 0;

        System.out.print("Bir Sayý Giriniz n1: ");
        n1 = inp.nextInt();
        System.out.print("Bir Sayý Giriniz n2: ");
        n2 = inp.nextInt();

        if (n1 > n2) {
            x = n2;
            y = n1;
        } else {
            x = n1;
            y = n2;
        }
        i=x-1;
        while (i > 0) {
            if (x % i == 0 && y % i==0){
                ebob=i;
                break;
            }i--;
        }System.out.println("EBOB: "+ebob);
        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK: "+ekok);
    }

}
