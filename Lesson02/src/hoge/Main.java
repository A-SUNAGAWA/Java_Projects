package hoge;

public class Main {

	public static void main(String[] args) {

		System.out.println("ようこそ占いの館へ");
		System.out.print("あなたの名前を入力してください >>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("あなたの年齢を入力してください >>");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.printf("%d歳の%sさん、あなたの運気番号は%dです\n",age,name,fortune);
		System.out.println("1:大吉 2:中吉 3:吉 4: 凶");

	}

}
