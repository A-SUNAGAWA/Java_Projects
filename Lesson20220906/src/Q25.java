

/*
 Q25
0~20の乱数を３個生成し、それを小さい順に出力する。
[実行例]
３つの乱数を小さい順に並べました。6,13,20
 */
public class Q25 {

	public static void main(String[] args) {
		// ①0~20乱数を3つ生成
		int num1 = new java.util.Random().nextInt(21);
		int num2 = new java.util.Random().nextInt(21);
		int num3 = new java.util.Random().nextInt(21);

		// ②並び替え
		// ②-1 num1とnum2を比較しnum1が大きければ入れ替える
		if (num1 > num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		// ②-2 num2 とnum3を比較しnum1が大きければ入れ替える
		if (num2 > num3) {
			int temp = num3;
			num3 = num2;
			num2 = temp;
		}
		// ②-3 num1 とnum2を比較しnum1が大きければ入れ替える
		if (num1 > num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}

		// ③表示する
		System.out.println("３つの乱数を小さい順に並べました。"
				+ num1 + "," + num2 + "," + num3);
	}

}


