package java1026;

public class Main2 {

	public static void main(String[] args) {
		Wand w = new Wand();
		Wizard wi = new Wizard();
		Hero h = new Hero();

		h.setName("HERO");
		h.setHp(100);
		w.setName("TUEETUE");
		wi.setName("MAHOTUKAI");
		w.setPower(5.0);
		wi.setHp(100);
		wi.setMp(50);
		wi.setWand(w);

		System.out.println(w.getName());
		System.out.println(w.getPower());
		System.out.println(wi.getName());
		System.out.println(wi.getHp());
		System.out.println(wi.getMp());
		System.out.println(wi.getWand());

		System.out.println(h.getHp());
		wi.heal(h);
		System.out.println(h.getHp());
	}

}
