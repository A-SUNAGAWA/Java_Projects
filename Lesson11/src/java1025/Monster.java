package java1025;

public abstract class Monster {
	int hp;

	public Monster(int hp) {
		this.hp = hp;

	}

	public abstract void info();

	public abstract void attack();
}
