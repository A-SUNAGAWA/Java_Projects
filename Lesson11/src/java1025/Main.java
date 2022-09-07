package java1025;

public class Main {

	public static void main(String[] args) {
		HobGoblin hob = new HobGoblin(500, 20000, "Hob");
		HobGoblin hob2 = new HobGoblin("Hob2");

		hob.info();
		hob2.info();
		hob2.attack();
		hob.hp--;
		hob.info();
		hob.charge();
		hob2.hp -= 50;
		hob.info();
		hob2.info();
		hob2.voice();
		hob2.run();


	}

}
