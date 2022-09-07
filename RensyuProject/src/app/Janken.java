package app;

import java.util.Scanner;

public class Janken {

	public static void main(String[] args) {
		System.out.println("じゃんけん.App");
		JankenMod jm = new JankenMod();
		do {
			System.out.println("じゃ～んけ～ん");
			System.out.print("1:グー 2:パー 3:チョキ その他:終了 >");
			int sr = new Scanner(System.in).nextInt();
			switch(sr) {
			case 1:
				System.out.println(jm.gu(sr));
				if(jm.gu(sr).equals("\n\n\n―――YOU DIED―――")) {
					return;
				}
				break;
			case 2:
				System.out.println(jm.pa(sr));
				if(jm.gu(sr).equals("\n\n\n―――YOU DIED―――")) {
					return;
				}
				break;
			case 3:
				System.out.println(jm.ty(sr));
				if(jm.gu(sr).equals("\n\n\n―――YOU DIED―――")) {
					return;
				}
				break;
			default:
				System.out.println("アプリを終了します。");
				return;
			}
		}while(true);
	}

}
