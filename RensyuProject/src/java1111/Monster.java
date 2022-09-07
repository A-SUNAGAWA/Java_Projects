package java1111;

public class Monster {
	String name;
	int hp;
	public Monster(String n) {
		this.name = n;
	}
	public void info() {
		System.out.printf("名前は%s、HPは%d%n",this.name,this.hp);
	}
	public void voice() {
		System.out.println("鳴き声を上げている");
	}

}
