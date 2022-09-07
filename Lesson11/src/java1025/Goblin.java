package java1025;

public class Goblin extends Monster implements Life, Creature{
	String name;

	public Goblin(int hp, String name) {
		super(hp);
		this.name = name;
	}

	public void info() {
		System.out.println("NAME:" + this.name);
		System.out.println("HP:" + this.hp);
	}

	public void voice() {
		System.out.println(this.name + "は喧しく叫んだ");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	public void attack() {
		System.out.println(this.name + "の攻撃！");
	}
}
