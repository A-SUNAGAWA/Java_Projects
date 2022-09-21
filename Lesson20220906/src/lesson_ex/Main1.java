package lesson_ex;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		int playCount=0;
		int[] cpu = new int[3];

		for(int i=0;i<cpu.length;i++) {
			cpu[i]=new Random().nextInt(9);
		}
		do {
			int hit = 0;
			int blow = 0;
			int[] player = new int[3];
			for(int i=0;i<player.length;i++) {
				System.out.print((i+1)+"番目の値>");
				player[i]=new Scanner(System.in).nextInt();
			}

			for(int i=0;i<cpu.length;i++) {
				for(int j=0;j<player.length;j++) {
					if(cpu[i]==player[j]) {
						if(i==j) {
							hit++;
						}else {
							blow++;
						}
					}
				}
			}
			playCount++;
			System.out.printf("hit:%d blow:%d\n",hit,blow);
			if(hit==3) {
				System.out.println("クリア！");
				break;
			}
			System.out.println(playCount>5?"ゲームオーバー":"");
		}while(playCount<=5);
	}

}
