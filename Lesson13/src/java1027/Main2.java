package java1027;

public class Main2 {

	public static void main(String[] args) {
		String[] day = {"日","月","火","水","木","金","土",};
		String[] dayEng = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday",};
		do {
			int i;
			int ser = new java.util.Random().nextInt(day.length);
			System.out.println("英語の曜日名を小文字で入力してください");
			System.out.print(day[ser] + "曜日:");
			String enter = new java.util.Scanner(System.in).nextLine();
			if(enter.equals(dayEng[ser])) {
				System.out.print("正解です。続ける？\n1:Yes / 2:No >");
				i = new java.util.Scanner(System.in).nextInt();
				switch(i) {
				case 1:
					continue;
				default:
					System.out.println("アプリケーションを終了します");
					return;
				}
			}else {
				System.out.print("違います(" + dayEng[ser] + ")。続ける？\n1:Yes / 2:No >");
				i = new java.util.Scanner(System.in).nextInt();
				switch(i) {
				case 1:
					continue;
				default:
					System.out.println("アプリケーションを終了します");
					return;
				}
			}

		}while(true);

	}

}
