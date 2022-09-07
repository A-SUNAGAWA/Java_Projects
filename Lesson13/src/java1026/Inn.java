package java1026;

public class Inn {
	public void checkIn(Hero h) {
		// h.hp = 100;
		h.sleep();
		// h.die();
	}

	void talk(Hero h) {
		System.out.println("王様:ようこそ我が国へ、勇者" + h.getName() + "よ。");
	}
}
