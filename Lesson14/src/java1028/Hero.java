package java1028;

public class Hero {
	int hp;
	String name;
	static int money;
	public static final int MAXHP = 100;

	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}else if(this.hp == h.hp) {
				return true;
			}
		}
		return false;
	}

	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		Hero.any();
	}

	public static void any() {}

}
