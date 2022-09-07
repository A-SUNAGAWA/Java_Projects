package javaBeforTest;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Rensyu3_2 {

	public static String Words(int choise) {
		String word = "";
		switch(choise) {
		case 0:
			word += "while(i>=100200999L)";
			break;
		case 1:
			word += "\n    input().YOU_AN_IDIOT.;";
			break;
		default:
			break;
		}
		return word;
	}

	public static void Hyouji(StringBuilder sb,int speed) throws InterruptedException{
		for(int i= 1;i<=12000;i++) {
			if(i%10==0) {
				sb.append("\n");
				System.out.println(sb);
				TimeUnit.MICROSECONDS.sleep(speed);
				continue;
			}
			if(i%64==0) {
				sb.append("★★");
				continue;
			}
			int choise = (int)Math.random()*100;
			sb.append(Words(choise));
		}
	}

	public static void main(String[] args) throws InterruptedException {
		StringBuilder sb = new StringBuilder();
		int speed = 1000000;
		System.out.println("なんかとてもハッカーっぽい文字列表示アプリ");
		do {
			System.out.println("1:等速/2:２倍速/3:４倍速/4:10倍速/5:100倍速/0:1000倍速/ほかの数字:終了");
			System.out.println("↓速度を選んでね↓(※等速は非推奨※)");
			System.out.print(">");
			int in = new Scanner(System.in).nextInt();
			switch(in) {
			case 1:
				break;
			case 2:
				speed /= 2;
				break;
			case 3:
				speed /= 4;
				break;
			case 4:
				speed /= 10;
				break;
			case 5:
				speed /= 100;
				break;
			case 0:
				speed /= 1000;
				break;
			default:
				System.out.println("終了します");
				return;
			}
			Hyouji(sb,speed);
		}while(true);
	}

}
