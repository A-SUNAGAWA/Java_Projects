package java1104;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Rensyu2 {

	public static void main(String[] args) {
		System.out.println("サイコロを繰り返し振ります");
		Set<Integer> saikoro = new TreeSet<>();
		int count = 0;
		while(true) {
			int deme = new Random().nextInt(6)+1;
			System.out.println(deme);
			count++;
			saikoro.add(deme);
			if(saikoro.size() == 6) {
				System.out.println(count + "回で揃いました");
				return;
			}
		}
	}

}
