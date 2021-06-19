package Odev13;
import java.util.Scanner;

public class Odev13 {
	public static void main(String[] args) {
		
		int day,month;
		String burc;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Dogdunuz Ay(1 ile 12 arasýnda):");
		month  = inp.nextInt();
		
		System.out.print("Dogdunuz Gun:");
		day  = inp.nextInt();
		
		if(month==1) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=21) {
				System.out.print("Burcunuz oglak.");
			}
			else if(day>=22) {
				System.out.print("Burcunuz kova.");
			}
			
		}
		
		if(month==2) {
			if(day<=28){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=19) {
				System.out.print("Burcunuz kova.");
			}
			else if(day>=20) {
				System.out.print("Burcunuz balik.");
			}
			
		}
		
		if(month==3) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=20) {
				System.out.print("Burcunuz balik.");
			}
			else if(day>=21) {
				System.out.print("Burcunuz koc.");
			}
			
		}
		
		if(month==4) {
			if(day<=30){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=20) {
				System.out.print("Burcunuz koc.");
			}
			else if(day>=21) {
				System.out.print("Burcunuz boga.");
			}
			
		}
		
		if(month==5) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=21) {
				System.out.print("Burcunuz boga.");
			}
			else if(day>=22) {
				System.out.print("Burcunuz ikizler.");
			}
			
		}
		
		if(month==6) {
			if(day<=30){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=22) {
				System.out.print("Burcunuz ikizler.");
			}
			else if(day>=23) {
				System.out.print("Burcunuz yengec.");
			}
			
		}
		
		if(month==7) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=22) {
				System.out.print("Burcunuz yengec.");
			}
			else if(day>=23) {
				System.out.print("Burcunuz aslan.");
			}
			
		}
		
		if(month==8) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=22) {
				System.out.print("Burcunuz aslan.");
			}
			else if(day>=23) {
				System.out.print("Burcunuz basak.");
			}
			
		}
		
		if(month==9) {
			if(day<=30){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=22) {
				System.out.print("Burcunuz basak.");
			}
			else if(day>=23) {
				System.out.print("Burcunuz terazi.");
			}
			
		}
		
		if(month==10) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=22) {
				System.out.print("Burcunuz terazi.");
			}
			else if(day>=23) {
				System.out.print("Burcunuz akrep.");
			}
			
		}
		
		if(month==11) {
			if(day<=30){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=21) {
				System.out.print("Burcunuz akrep.");
			}
			else if(day>=22) {
				System.out.print("Burcunuz yay.");
			}
			
		}
		
		if(month==12) {
			if(day<=31){
				System.out.println("Burcunuz hesaplaniyor...");
			}
			else {
				System.out.print("Ýstenilen aralikta deger giriniz!");
				return;
			}
			

			if(day<=21) {
				System.out.print("Burcunuz yay.");
			}
			else if(day>=22) {
				System.out.print("Burcunuz oglak.");
			}
			
		}
	}
		
}
	