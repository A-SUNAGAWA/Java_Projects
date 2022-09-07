package java1025;

public class Main {

	public static void main(String[] args) {
		Character c = new SuperHero();
		Life lf = new Hero();

		Wizard w = new Wizard();
		Monster m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);

		Slime s = new Slime();
		Monster m2 = new Slime();
		s.run();
		m2.run();

		if(c instanceof SuperHero) {
			SuperHero h = (SuperHero)c;
			h.fly();
		}

		Character[] c2 = new Character[4];
		c2[0] = new Hero();
		c2[1] = new Hero();
		c2[2] = new Wizard();
		c2[3] = new Wizard();
		for(Character ch : c2) {
			ch.hp += 50;
		}

		Monster[] monsters = {new Slime(), new Matango()};
		for (Monster m3 : monsters) {
			m3.run();
		}

		Hero h = new Hero();
		h.attack(monsters[0]);
		h.attack(monsters[1]);
	}

}
