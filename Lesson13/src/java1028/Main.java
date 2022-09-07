package java1028;

public class Main {


	public static void main(String[] args) {
		System.out.println("あなたの部下に3人配属されました");
		OfficeWorker[] hako = new OfficeWorker[3];
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "人目の名前を入力してください");
			String name = new java.util.Scanner(System.in).nextLine();
			int n = new java.util.Random().nextInt(3);
			switch(n) {
			case 0:
				OfficeWorker oo = new OrdinaryOfficeWorker(name);
				hako[i] = oo;
				oo.introduce();
				break;
			case 1:
				OfficeWorker eo = new EliteOfficeWorker(name);
				hako[i] = eo;
				eo.introduce();
				break;
			case 2:
				OfficeWorker lo = new LazyOfficeWorker(name);
				hako[i] = lo;
				lo.introduce();
				break;
			}
		}
		do {
			System.out.println("誰の働きぶりを見に行きますか？");
			System.out.println("0・・・" + hako[0].name);
			System.out.println("1・・・" + hako[1].name);
			System.out.println("2・・・" + hako[2].name);
			System.out.println("3・・・終了");
			System.out.print("番号を入力してください>");
			int ser = new java.util.Scanner(System.in).nextInt();
			switch(ser) {
			case 0:
				hako[0].work();
				break;
			case 1:
				hako[1].work();
				break;
			case 2:
				hako[2].work();
				break;
			case 3:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}while(true);
	}

}
