package animal;

public class Main {

	public static void main(String[] args) {
		Seaturtle st = new Seaturtle();
		Gianttortoise gt = new Gianttortoise();
		Iguana i = new Iguana();
		JapaneseRatSnake jrs = new JapaneseRatSnake();
		Crocodile c = new Crocodile();
		Yamori y = new Yamori();


		i.moulting();
		jrs.layingEggs();
		jrs.eating(i);
		i.eating(gt);
		y.fallYamori(66, jrs);
	}

}
