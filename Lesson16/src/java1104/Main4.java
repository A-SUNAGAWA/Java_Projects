package java1104;

import java.util.LinkedList;
import java.util.List;

public class Main4 {

	public static void printList(List<Character> list) {
		for(char c : list) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		System.out.println(list.get(2));

		printList(list);
	}

}
