
public class Q32 {

	public static void main(String[] args) {
		// 名前配列
		String names[] = {"A","B","C","D","E"};
		//{第一教科配列},{第二教科配列},{第三教科配列}
		int scores[][] = {{80, 92, 60 ,100, 78},{60, 45, 65 ,56, 80},{64, 89, 48 ,45, 67}};
		// 個人の合計得点の配列
		int[] totals = new int[5];

		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				// 個人の合計得点の保存
				totals[j] += scores[i][j];
			}
		}

		// 合計得点の表示
		for(int i = 0; i < totals.length; i++){
			System.out.println(names[i] + "さんの合計得点 = " + totals[i]);
		}
	}
}
