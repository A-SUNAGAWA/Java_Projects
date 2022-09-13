package lesson03;

import java.util.Random;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		System.out.println("ブラックジャックを開始します");

		while (true) {

			int playerCount = 0;
			int playerPoint = 0;
			int cpuPoint = 0;

			System.out.println(++playerCount + "枚目のカードを配ります");
			playerPoint += new Random().nextInt(13)+1;
			cpuPoint += new Random().nextInt(13)+1;

			System.out.println("あなたの現在の点数:" + playerPoint);
			System.out.println("cpuの現在の点数:" + cpuPoint);

			int cpuCount = playerCount;

			while(playerPoint < 21) {
				System.out.println("カードを追加しますか？ (y/n)");
				if(new Scanner(System.in).nextLine().equals("y")) {
					System.out.println(++playerCount + "枚目のカードを配ります");
					playerPoint += new Random().nextInt(13)+1;
					System.out.println("あなたの現在の点数:"+playerPoint);
					continue;
				}else {
					break;
				}
			}
			if(playerPoint == 21) {
				System.out.println("ブラックジャック！");
				System.out.println("あなたの勝ちです！");
				break;
			}else if(playerPoint >= 22) {
				System.out.println("バーストしたのであなたの負けです。");
				System.out.println("やりなおしますか？ (y/n)");
				if(new Scanner(System.in).nextLine().equals("y")) {
					continue;
				}else {
					break;
				}
			}

			while(cpuPoint < 17) {
				System.out.printf("cpuに%d枚目のカードを配ります\n",++cpuCount);
				cpuPoint += new Random().nextInt(13)+1;
				System.out.println("cpuの現在の点数:"+cpuPoint);
				continue;
			}
			if(cpuPoint >= 22) {
				System.out.println("cpuがバーストしました！");
				System.out.println("あなたの勝ちです！");
				break;
			}

			System.out.println("結果");
			System.out.printf("あなたの点数:%d cpuの点数:%d\n",playerPoint,cpuPoint);
			if(21 - cpuPoint < 21 - playerPoint) {
				System.out.println("あなたの負けです。");
				System.out.println("やりなおしますか？ (y/n)");
				if(new Scanner(System.in).nextLine().equals("y")) {
					continue;
				}else {
					break;
				}
			}else {
				System.out.println("あなたの勝ちです！");
				break;
			}

		}
		System.out.println("終了します");
	}

}
