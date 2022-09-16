package lesson05;

public class Main5 {

	public static int damageCalculate(int atk, int def) {
		int lowestDamage = 5;
		return Math.max(lowestDamage, (atk + 20) - def);
	}

	public static void showDamageMessage(String name, int damage) {
		System.out.printf("%sは%dのダメージを受けた！",name,damage);
	}

	public static void main(String[] args) {
		int def = 150;
		int atk = 100;
		int damage;
		String name = "ミナト";
		damage = damageCalculate(atk,def);
		showDamageMessage(name,damage);
	}

}
