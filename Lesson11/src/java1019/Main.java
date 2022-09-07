package java1019;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');

		System.out.println("現在HP:" + h.hp);
		pm.attack(h);
		System.out.println("現在HP:" + h.hp);
	}

}
