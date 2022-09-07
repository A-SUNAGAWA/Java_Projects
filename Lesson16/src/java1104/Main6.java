package java1104;

import java.util.HashSet;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();//順番関係なしに要素を格納する。
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		//get()がないため、indexを指定して要素を取り出すことはできない
		//そもそもindexも存在しない
		for(String s : colors) {//拡張for文で要素を取り出す場合、順番は適当
			System.out.print(s + "→");
		}
	}

}
