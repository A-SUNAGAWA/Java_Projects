package lesson03;

public class Main6 {

	public static void main(String[] args) {

		int day = 1;

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
