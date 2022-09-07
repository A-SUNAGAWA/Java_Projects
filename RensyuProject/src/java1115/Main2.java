package java1115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("d");
		list.add("a");
		list.add("c");
		list.add("b");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
