package lesson03;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		System.out.print("年 >>");
		int year = new Scanner(System.in).nextInt();
		System.out.print("月 >>");
		int month = new Scanner(System.in).nextInt();

		int y = (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + 1) % 7;

		int day = 1;
		int dayLimit = 0;

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dayLimit = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dayLimit = 30;
				break;
			case 2:
				if(year % 4 == 0) {
					if(year % 100 == 0 && year % 400 != 0) {
						dayLimit = 28;
					}else {
						dayLimit = 29;
					}
				}else {
					dayLimit = 28;
				}
		}

		for(int rows=0;rows<6;rows++) {
			for(int youbi=0;youbi<7;youbi++) {
				if(rows == 0) {
					System.out.print("日 月 火 水 木 金 土");
					break;
				}
				if(day > 30) {
					break;
				}
				if(rows == 1) {
					if(youbi >= 4) {
						System.out.print(day++ + "  ");
					}else {
						System.out.print("   ");
					}
				}else if(day < 10){
					System.out.print(day++ + "  ");
				}else {
					System.out.print(day++ + " ");
				}
			}
			System.out.println("");
		}
	}

}
