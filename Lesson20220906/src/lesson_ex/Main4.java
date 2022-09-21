package lesson_ex;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int maruRow = 1;
		int maruCol = 1;
		int beforeRow = 1;
		int beforeCol = 1;
		while(true) {
			char[][] tiles = {
					{'■', '■', '■', '■', '■', '■', '■', '■', '■', '■'},
					{'■', '□', '□', '□', '□', '□', '□', '□', '□', '■'},
					{'■', '□', '□', '□', '□', '□', '□', '□', '□', '■'},
					{'■', '□', '□', '□', '□', '□', '□', '□', '□', '■'},
					{'■', '□', '□', '□', '□', '□', '□', '□', '□', '■'},
					{'■', '□', '□', '□', '□', '□', '□', '□', '□', '■'},
					{'■', '■', '■', '■', '■', '■', '■', '■', '■', '■'}
			};
			if(tiles[maruRow][maruCol] == '■') {
				maruRow = beforeRow;
				maruCol = beforeCol;
				continue;
			}else {
				tiles[maruRow][maruCol] = '●';
				beforeRow = maruRow;
				beforeCol = maruCol;
			}
			for(int i=0;i<tiles.length;i++) {
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
