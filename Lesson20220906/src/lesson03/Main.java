package lesson03;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("じゃんけんゲーム");
		while(true) {
			System.out.println("じゃ～んけ～ん");
			System.out.println("1:グー 2:チョキ 3:パー それ以外:終了");

			int playerChose = new Scanner(System.in).nextInt();

			if(playerChose <= 0 || playerChose - 3 > 0) {
				System.out.println("終了");
				break;
			}

			int cpuChose = new Random().nextInt(3) + 1;
			System.out.print("cpuの手:");
			if(cpuChose == 1) {
				System.out.println("グー");
			}else if(cpuChose == 2) {
				System.out.println("チョキ");
			}else {
				System.out.println("パー");
			}

			int result = cpuChose - playerChose;
			if(result == 0) {
				System.out.println("あいこ！");
				continue;
			}else if(result == -1 || result == 2) {
				System.out.println("あなたの負け！");
				continue;
			}else {
				System.out.println("あなたの勝ち！");
				continue;
			}

		}
	}
}
