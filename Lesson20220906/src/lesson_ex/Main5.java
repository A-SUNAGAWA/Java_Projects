package lesson_ex;

import java.util.Scanner;

public class Main5 {

	public static boolean game() {
		int[][] maruPos = {{1,1},{1,1}};
		boolean isDead = false;

		while(true) {

			char[][] tiles = {
					{'■', '■', '■', '■', '■', '■', '■', '■', '■', '■', '■'},
					{'■', '□', '■', '○', '□', '□', '■', '□', '□', '□', '■'},
					{'■', '□', '■', '■', '■', '□', '■', '□', '■', '□', '■'},
					{'■', '□', '□', '□', '■', '□', '■', '□', '■', '□', '■'},
					{'■', '■', '■', '□', '■', '□', '□', '□', '■', '□', '■'},
					{'■', '□', '□', '□', '□', '□', '■', '■', '■', '□', '■'},
					{'■', '□', '■', '■', '■', '□', '■', '□', '□', '□', '■'},
					{'■', '○', '■', '□', '□', '□', '■', '□', '■', '■', '■'},
					{'■', '■', '■', '□', '■', '■', '■', '□', '■', '☆', '■'},
					{'■', '○', '□', '□', '■', '○', '□', '□', '□', '□', '■'},
					{'■', '■', '■', '■', '■', '■', '■', '■', '■', '■', '■'}
			};
			int state = state(tiles[maruPos[0][0]][maruPos[1][0]]);
			if(state == 1) {
				maruPos[0][0] = maruPos[0][1];
				maruPos[1][0] = maruPos[1][1];
				continue;
			}else if(state == 2){
				break;
			}else if(state == 3) {
				isDead = true;
				break;
			}else {
				tiles[maruPos[0][0]][maruPos[1][0]] = '●';
				maruPos[0][1] = maruPos[0][0];
				maruPos[1][1] = maruPos[1][0];
			}
			draw(tiles);
			maruPos = move(new Scanner(System.in).nextLine(),maruPos);
		}
		return isDead;
	}

	public static int state(char c) {
		int state=0;
		switch(c) {
		case '■':
			state = 1;
			break;
		case '☆':
			state = 2;
			break;
		case '○':
			state = 3;
			break;
		default:
			break;
		}
		return state;
	}

	public static int[][] move(String s, int[][] maruMove){
		if(s.equals("w")) {
			maruMove[0][0]--;
		}
		if(s.equals("s")) {
			maruMove[0][0]++;
		}
		if(s.equals("a")) {
			maruMove[1][0]--;
		}
		if(s.equals("d")) {
			maruMove[1][0]++;
		}
		return maruMove;
	}

	public static void draw(char[][] tiles){
		for(int i=0;i<tiles.length;i++) {
			for(int j=0;j<tiles[i].length;j++) {
				System.out.print(tiles[i][j]);
			}
			System.out.println("");
		}
	}

	public static void gameStart() {
		System.out.println("ゲームスタート！");
	}

	public static void gameEnd(boolean isDead) {
		System.out.println(isDead?"ゲームオーバー":"ゲームクリア！");
	}

	public static void main(String[] args) {
		gameStart();
		gameEnd(game());
	}
}
