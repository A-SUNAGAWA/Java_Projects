package java1025;

public class HobGoblin extends Goblin{
	int mp;
	int chargeCount;

	public HobGoblin(int hp, int mp, String name) {
		super(hp, name);
		this.mp = mp;
	}

	public HobGoblin(String name) {
		this(80, 10, name);
	}

	public void info() {
		super.info();
		System.out.println("MP:" + this.mp);
	}

	public void charge() {
		System.out.println(this.name + "の突進！！");
		this.chargeCount++;
		this.mp--;
	}

	public void attack() {
		System.out.println(this.name + "の攻撃");
	}

}
