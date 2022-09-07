package java1115;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MapRensyu {

	public static void main(String[] args) {
		Map<Character,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		map.put('a', "apple");
		map.put('b', "base");
		map.put('c', "cat");
		char last;
		char start;
		System.out.println("a-zで入力/jから入力");
		System.out.print("j>");
		do {
			String in = sc.nextLine();
			last = in.charAt(in.length()-1);
			start = in.charAt(0);
			if(in.equals("end")) {
				break;
			}
			if(map.containsKey(last)){
				System.out.println(map.get(last));
				System.out.print(map.get(last).charAt(map.get(last).length()-1) + ">");
			}else {
				map.put(start, in);
				System.out.print(last+">");
			}
		}while(true);
	}

}
