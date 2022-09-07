package java1019;

public class PoisonMatango extends Matango{

	int poisoncount = 5;

	public PoisonMatango(char suffix){
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if(poisoncount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int poison = h.hp / 5 + new java.util.Random().nextInt(3);
			System.out.println(poison + "ポイントのダメージ！");
			h.hp -= poison;
			poisoncount --;
		}
	}
}
