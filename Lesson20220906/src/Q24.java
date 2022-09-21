

/*
 Q24
二つの数値を入力させ、その2値の入れ替えを行え。

[実行例]
xに代入する数値をいれてください。>5[enter]
yに代入する数値をいれてください。>3[enter]
２つの数値を入れ替えました。x:3,y:5
 */
public class Q24 {

	public static void main(String[] args) {
		// ①xに代入する数値をいれてください。>と表示
		System.out.println("①xに代入する数値をいれてください。>");
		// ②数値の入力を受け付ける
		int x = new java.util.Scanner(System.in).nextInt();
		// ③yに代入する数値をいれてください。>と表示
		System.out.println("yに代入する数値をいれてください。>");
		// ④数値の入力を受け付ける
		int y = new java.util.Scanner(System.in).nextInt();

		// ⑤数値の入れ替えを行う
		// ⑤-1任意の新しい変数を用意してxを代入
		int temp = x;
		// ⑤-2xにyを代入
		x = y;
		// ⑤-3yに⑤-1で用意した変数を代入
		y = temp;

		// ⑥表示
		System.out.println("２つの数値を入れ替えました。x:" + x + ",y:" + y);

	}

}
