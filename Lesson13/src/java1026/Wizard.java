package java1026;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int  getHp() {return this.hp;}

	public void setHp(int h) {
		if(h < 0) {
			h = 0;
		}
		this.hp = h;
	}

	public int getMp() {return this.mp;}

	public void setMp(int m) {
		if (m < 0) {
			throw new IllegalArgumentException("0以上の数を指定してください");
		}
		this.mp = m;
	}

	public String getName() {return this.name;}

	public void setName(String n) {
		if(n.length() <= 2) {
			throw new IllegalArgumentException("3文字以上を指定してください");
		}
		this.name = n;
	}

	public Wand getWand() {return this.wand;}

	public void setWand(Wand w) {
		if(w == null) {
			throw new IllegalArgumentException("杖がnullです");
		}
		this.wand = w;
	}

	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

}
