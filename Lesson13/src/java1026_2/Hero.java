package java1026_2;

public class Hero {
	private int hp;
	private String name;
	private boolean boo;

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
		// die();
	}

	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		if(n == null){
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if(n.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if(n.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = n;
	}

	public boolean isBoo() {
		return this.boo;
	}

	public int getHp() {
		return this.hp;
	}

}
