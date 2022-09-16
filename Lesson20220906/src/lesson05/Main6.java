package lesson05;

public class Main6 {

	public static void showStatus(int hp) {
		System.out.println("HP:"+hp);
		System.out.println("の");
		System.out.println("中立オブジェクトです");;
	}

	public static void showStatus(int hp, int atk, int def) {
		System.out.println("HP:"+hp);
		System.out.println("ATK:"+atk);
		System.out.println("DEF:"+def);
		System.out.println("の");
		System.out.println("中立オブジェクトです");;
	}

	public static void showStatus(int hp, int atk, int def, boolean isFriend) {
		System.out.println("HP:"+hp);
		System.out.println("ATK:"+atk);
		System.out.println("DEF:"+def);
		System.out.println("の");
		System.out.println(isFriend ? "味方" : "敵" + "オブジェクトです");
	}

	public static void main(String[] args) {

		int hp = 300;
		int atk = 30;
		int def = 25;
		boolean isFriend = false;

		showStatus(hp,atk,def,isFriend);
	}

}
