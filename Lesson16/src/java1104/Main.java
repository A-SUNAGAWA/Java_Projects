package java1104;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//配列と同じような使い方
		ArrayList<String> names = new ArrayList<>();
		//<>←の中にはインスタンスしか入らない(intとかbooleanとかは入らない)
		names.add("たなか");	//index 0
		names.add("すずき");	//index 1
		names.add("さいとう");	//index 2
		System.out.println(names.get(2));//int番目の要素を返す

		ArrayList<Integer> points = new ArrayList<>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(1,30);
		System.out.println(points.get(1));
		points.set(1, 45);//int番目に要素を挿入(リストが一つ増える)
		for(int i : points) {
			System.out.println(i);
		}
		System.out.println(points.size());			//格納されている要素数を返す(戻り値:int)
		//.lengthの代わりに使える
		System.out.println(points.isEmpty());		//要素数が0であるかを判定(戻り値:boolean)
		System.out.println(points.contains(80));	//指定要素が含まれているかを判定(戻り値:boolean)
		System.out.println(points.indexOf(80));		//指定要素が何番目にあるかを判定(戻り値:int)
		points.remove(0);							//int番目の要素を削除する(リストが一つ減る)
		//points.clear();							//要素をすべて削除する
		
	}

}
