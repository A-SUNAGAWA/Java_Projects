package app;

import java.util.Random;

public class JankenMod {
	private int cpuHate;

	//1=グー、2=パー、3=チョキと定義

	public String gu(int sr) {
		//グーが選ばれた場合のメソッド
		String kekka = "";
		int cpsr = new Random().nextInt(3)+1;
		System.out.println("\nYourChoise:"+ printer(sr)+"\nMyChoise:"+printer(cpsr));
		return kekka = hantei(sr,cpsr);
	}

	public String pa(int sr) {
		//パー選ばれた場合のメソッド
		String kekka = "";
		int cpsr = new Random().nextInt(3)+1;
		System.out.println("\nYourChoise:"+ printer(sr)+"\nMyChoise:"+printer(cpsr));
		return kekka = hantei(sr,cpsr);
	}

	public String ty(int sr) {
		//チョキが選ばれた場合のメソッド
		String kekka = "";
		int cpsr = new Random().nextInt(3)+1;
		System.out.println("\nYourChoise:"+ printer(sr)+"\nMyChoise:"+printer(cpsr));
		return kekka = hantei(sr,cpsr);
	}

	public String hantei(int sr, int cpsr) {
		//結果を判定するメソッド。何回も書きたくない
		//3回連勝するとCPUに殺される
		String kekka = "";
		if(this.cpuHate >= 3) {
			System.out.println("CPUが殴り掛かってきた！！！");
			kekka = "\n\n\n―――YOU DIED―――";
		}else if(cpsr == sr) {
			kekka = "\n\nあいこ。\n";
			this.cpuHate = 0;
		}else if(cpsr - sr == 1 || sr - cpsr == 1){
			kekka = "\n\n俺の勝ち。なんで負けたか、明日までに考えといてください。\n";
			this.cpuHate = 0;
		}else {
			kekka = "\n\nYOU WIN!!!\n";
			this.cpuHate++;
		}
		return kekka;
	}

	public static String printer(int cpsr) {
		//intを受け取り、何が選ばれたのか表示するメソッド
		String pr = "";
		switch(cpsr) {
		case 1:
			pr = "グー";
			break;
		case 2:
			pr = "パー";
			break;
		case 3:
			pr = "チョキ";
			break;
		}
		return pr;
	}

}
