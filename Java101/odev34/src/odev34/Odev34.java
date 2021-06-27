package odev34;
import java.util.Scanner;

public class Odev34 {
	static void plus() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". say� :");
            number = inp.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonu� : " + result);
    }

    static void minus() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = inp.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� :");
            number = inp.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonu� : " + result);
    }

    static void times() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". say� :");
            number = inp.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonu� : " + result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = inp.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� :");
            number = inp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("B�leni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonu� : " + result);
    }

    static void power() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban de�eri giriniz :");
        int base = inp.nextInt();
        System.out.print("�s de�eri giriniz :");
        int exponent = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonu� : " + result);
    }

    static void factorial() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Say� giriniz :");
        int n = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonu� : " + result);
    }
    
    static void mod() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Mod al�nacak Say�y� Giriniz :");
        int n= inp.nextInt();
        System.out.println("Mod giriniz :");
        int m= inp.nextInt();
        int result=n%m;
        System.out.println("Mod :"+" " +result);
    }
    static void rectangle() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenar giriniz :");
        int l = inp.nextInt();
        System.out.print("K�sa kenar giriniz :");
        int s = inp.nextInt();
        int perimeter = (l+s)*2;
        int field = l*s;
        System.out.println("�evre :" +perimeter);
        System.out.println("Alan :"+field);

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";

        do {
            System.out.println(menu);
            System.out.print("L�tfen bir i�lem se�iniz :");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
	

}
