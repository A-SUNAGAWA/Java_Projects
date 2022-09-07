package java1025;

public class SuperHero extends Hero{

	public SuperHero(){
		System.out.println("SuperHeroのコンストラクタが動作");
	}

	public void fly() {
		System.out.println(this.name + "は飛んだ");
	}

}
