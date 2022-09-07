package java1104;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Rensyu {

	public static void main(String[] args) {
		System.out.print("何回振る>>");
		int cou = new Scanner(System.in).nextInt();
		Set<Integer> saikoro = new TreeSet<>();
		for(int i = 0;i < cou; i++) {
			int deme = new Random().nextInt(6)+1;
			saikoro.add(deme);
		}
		Iterator<Integer> it = saikoro.iterator();
		while(it.hasNext()) {
			int s = it.next();
			System.out.println(s);
		}
		if(saikoro.size() == 1) {
			System.out.println("ゾロ目です");
		}else {
			System.out.println("ゾロ目ではありません");
		}
	}

}
