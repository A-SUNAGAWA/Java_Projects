package javaBeforTest;

import java.util.Scanner;

public class Rensyu3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x >");
		int x = sc.nextInt();
		System.out.print("y >");
		int y = sc.nextInt();
		if(x > y) {
			System.out.println("xはyより大きい。");
		}
	}

}
