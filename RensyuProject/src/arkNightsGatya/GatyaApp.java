package arkNightsGatya;

public class GatyaApp {

	public static void gatya() {
		Rare6_Gentei r6 = new Rare6_Gentei();
		int per = new java.util.Random().nextInt(100);
		if(per > 40) {
			if(per > 90) {
				if(per > 98) {
					r6.GenteiHantei();
				}else {
					System.out.println("☆5");
				}
			}else {
				System.out.println("☆4");
			}
		}else {
			System.out.println("☆3");
		}
	}

	public static void main(String[] args) {
		System.out.println("アクナイざっくりガチャシミュ");
		int i = 0;
		while(true) {
			if(i == 300) {
				System.out.println("天井に到達しました");
				return;
			}
			System.out.print("1: 単発 / 2: 10連 / 3: 終了(リザルト表示)");
			int enter = new java.util.Scanner(System.in).nextInt();
			switch(enter) {
			case 1:
				i++;
				gatya();
				break;
			case 2:
				i += 10;
				for(int t = 0; t < 10; t++) {
					gatya();
				}
				break;
			case 3:
				System.out.println(i + "回引きました");
				System.out.println("アプリを終了します");
				return;
			}
		}
	}

}
