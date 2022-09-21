package lesson_ex;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int maru = 0;
		while(true) {
			char[] tiles = {'□', '□', '□', '□', '□', '□', '□', '□'};
			if(tiles.length<=maru || maru < 0) {
				maru = 0;
			}
			tiles[maru] = '●';
			for(int i=0;i<tiles.length;i++) {
				System.out.print(tiles[i]);
			}
			System.out.println("");
			String move = new Scanner(System.in).nextLine();
			if(move.equals("a")) {
				maru--;
			}else if(move.equals("d")) {
				maru++;
			}
		}
	}

}
