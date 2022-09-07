package java1105;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rensyu16 {

	//⑴ Set	⑵ List		⑶ Map

	public static void main(String[] args) {
		Hero h = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		ArrayList<Hero> herobox = new ArrayList<>();
		herobox.add(h);
		herobox.add(h2);
		for(Hero he : herobox) {
			System.out.println(he.getName());
		}

		Map<Hero, Integer> kill = new HashMap<>();
		kill.put(h, 3);
		kill.put(h2, 7);
		for(Hero key : kill.keySet()) {
			int value = kill.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}

}
