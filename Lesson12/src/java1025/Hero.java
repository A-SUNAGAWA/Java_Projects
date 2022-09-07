package java1025;

public class Hero extends Character{
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
	}
}
