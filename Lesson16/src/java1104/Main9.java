package java1104;

import java.util.ArrayList;
import java.util.List;

class Hero{
	public String name;
	Item item;
}

class Item{

	String name;
}

public class Main9 {

	public static void main(String[] args) {
		Hero h = new Hero();
		Hero h2 = new Hero();
		Item i = new Item();
		h.name = "ミナト";
		h.item = i;
		h.item.name  = "木の棒";
		h2.name = "アサカ";
		h2.item = h.item;
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		list.add(h2);
		h2.item.name = "上書き";
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).item.name);
		System.out.println(list.get(1).item.name);

	}

}
