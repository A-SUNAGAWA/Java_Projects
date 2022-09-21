

/*
 Q27
実行例のような描画をせよ。
[実行例]
★
★★
★★★
 */
public class Q27 {

	public static void main(String[] args) {
		// ①縦のループを作成する
		for (int i = 0; i < 3; i++) {
			// ②横のループを作成する
			// ※ 縦のループ回数になるまで横のループを回す
			for (int j = 0; j <= i ; j++) {
				//③★を表示する
				System.out.print("★");
			}
			//④改行を表示
			System.out.println("");
		}

	}

}
