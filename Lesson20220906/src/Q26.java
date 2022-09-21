

/*
 Q26
実行例のような３行３列の描画をせよ。
[実行例]
★★★
★★★
★★★
 */
public class Q26 {

	public static void main(String[] args) {
		// ①縦のforループを作成する
		for (int i = 0; i < 3; i++) {
			// ②横のforループを作成する
			for (int j = 0; j < 3; j++) {
				//③★を出力する
				System.out.print("★");
			}
			//④改行を出力する
			System.out.println("");
		}

	}
}
