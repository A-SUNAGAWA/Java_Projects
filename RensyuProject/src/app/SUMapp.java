package app;

import java.util.Scanner;

public class SUMapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[2];
		int sum = 0;
		for(int i:array) {
			System.out.print("数字:");
			int t = sc.nextInt();
			if(t<=10000||t>=-10000) {
				array[i] = t;
			}
			sum += array[i];
		}
		System.out.println(sum);
	}

}
