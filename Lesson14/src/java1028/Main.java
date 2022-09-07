package java1028;

public class Main {

	public static void printAnything(Object o) {
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
		printAnything(o3);

		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h.toString());
		System.out.println(h);

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト2";
		h2.hp = 100;
		if(h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}

		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		h1.money = 300;
		System.out.println(h2.money);
	}

}
