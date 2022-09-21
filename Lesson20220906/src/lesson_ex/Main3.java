package lesson_ex;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int maruRow = 0;
		int maruCol = 0;
		while(true) {
			char[][] tiles = {{'□', '□', '□', '□', '□', '□', '□', '□'},
					{'□', '□', '□', '□', '□', '□', '□', '□'},
					{'□', '□', '□', '□', '□', '□', '□', '□'},
					{'□', '□', '□', '□', '□', '□', '□', '□'},
					{'□', '□', '□', '□', '□', '□', '□', '□'}};
			for(int i=0;i<tiles.length;i++) {
				if(maruRow >= tiles.length || maruCol >= tiles[i].length ||
						maruRow < 0 || maruCol < 0) {
					maruRow = 0;
					maruCol = 0;
				}
				tiles[maruRow][maruCol] = '●';
				for(int j=0;j<tiles[i].length;j++) {
					System.out.print(tiles[i][j]);
				}
				System.out.println("");
			}
			String move = new Scanner(System.in).nextLine();
			if(move.equals("w")) {
				maruRow--;
			}
			if(move.equals("s")) {
				maruRow++;
			}
			if(move.equals("a")) {
				maruCol--;
			}
			if(move.equals("d")) {
				maruCol++;
			}
		}

	}

}
