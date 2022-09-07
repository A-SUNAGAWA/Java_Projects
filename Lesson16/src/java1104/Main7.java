package java1104;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main7 {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		Iterator<String> it = words.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + "→");
		}
	}

}
