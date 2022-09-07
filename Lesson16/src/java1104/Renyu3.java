package java1104;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Renyu3 {

	public static void main(String[] args) {
		System.out.println("1-10のランダムな値を10個生成します。");
		Set<Integer> numsbox = new TreeSet<>();
		System.out.print("{");
		for(int i = 0;i < 10; i++) {
			if(i == 9) {
				int num = new Random().nextInt(10)+1;
				System.out.print(num);
				numsbox.add(num);
			}else{
				int num = new Random().nextInt(10)+1;
				System.out.print(num + ", ");
				numsbox.add(num);
			}
		}
		System.out.println("}");
		System.out.println("出目の種類を昇順に表示します");
		Iterator<Integer> it = numsbox.iterator();

	}

}
