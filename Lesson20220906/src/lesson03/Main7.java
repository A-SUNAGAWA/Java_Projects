package lesson03;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		System.out.println("カレンダー");

		System.out.print("年(西暦) >>");
		int year = new Scanner(System.in).nextInt();
		System.out.print("月 >>");
		int month = new Scanner(System.in).nextInt();

		if(month < 0 || month > 13) {
			System.out.println("1～12月の範囲で入力してください");
			return;
		}

		if(month < 3) {
			month = month == 1 ? 13 : 14;
			year--;
		}

		int youbi = (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + 1) % 7;

		year = month > 12 ? ++year:year;

		int day = 1;
		int dayLimit = 0;

		switch (month) {
			case 13:
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
			case 14:
				if(year % 4 == 0) {
					if(year % 100 == 0 && year % 400 != 0) {
						dayLimit = 28;
					}else {
						dayLimit = 29;
					}
				}else {
					dayLimit = 28;
				}
				break;
		}

		for(int rows=0;rows<6;rows++) {
			for(int columns=0;columns<7;columns++) {
				if(rows == 0) {
					System.out.print("日 月 火 水 木 金 土");
					break;
				}
				if(day > dayLimit) {
					break;
				}
				if(rows == 1) {
					if(columns >= youbi) {
						System.out.print(" " + day++ + " ");
					}else {
						System.out.print("   ");
					}
				}else if(day < 10){
					System.out.print(" " + day++ + " ");
				}else {
					System.out.print(day++ + " ");
				}
			}
			System.out.println("");
		}
	}

}
