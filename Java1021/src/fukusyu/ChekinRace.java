package fukusyu;

public class ChekinRace {

	public static void main(String[] args) {
		int NUM = new java.util.Random().nextInt(40) + 20;
		while(true) {
			System.out.print("1～5の整数を入力してください:");
			int num = new java.util.Scanner(System.in).nextInt(6);
			if(num == 0) {
				System.out.println("0はだめです。");
				continue;
			}
			NUM -= num;
			if(NUM <= 0) {
				System.out.println("アウト！");
				return;
			}
		}

	}

}
