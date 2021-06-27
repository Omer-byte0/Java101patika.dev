package odev37;
import java.util.Scanner;

public class Odev37 {
	static void calc(int sayi) {
        int temp = sayi;
        System.out.print(temp);
        while (temp > 0) {
            System.out.print("\t"+(temp -= 5));
        }
        while (temp <= sayi) {
            System.out.print("\t"+(temp += 5));
            if (temp == sayi) {
                break;
            }


        }

    }


    public static void main(String[] args) {
        int i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayý giriniz :");
        i = inp.nextInt();
        System.out.println(" ");
        calc(i);
    }

}
