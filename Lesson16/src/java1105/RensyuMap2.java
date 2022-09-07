package java1105;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RensyuMap2 {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		map.put(5, 0);
		map.put(6, 0);
		System.out.print("サイコロを何回振りますか>");
		int num = new Scanner(System.in).nextInt();
		for(int i = 1;i < num;i++) {
			int deme = new Random().nextInt(6)+1;
			map.put(deme, map.get(deme)+1);
		}
		System.out.println("***result***");
		for(int key : map.keySet()) {
			System.out.println(key + "…" + map.get(key) + "回");
		}
	}

}
