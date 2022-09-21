
public class Q33 {

	public static void main(String[] args) {
		//12行31列の2次元配列
		int[][] sales = new int[12][31];
		//月の日数配列
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		//データ作成a
		for(int i = 0; i <sales.length; i++){
			for(int j = 0; j<days[i]; j++){
				sales[i][j] = new java.util.Random().nextInt(41)+10;
			}
		}

		//データ出力
		for(int i = 0;i < sales.length; i++){
			System.out.printf("%2d|",i+1);
			int mTotal = 0;
			for(int j = 0;j < sales[i].length;j++){// 31回まわる
				mTotal+=sales[i][j];
				//三項演算子	if(sales[i][j]==0){}else{}
				System.out.printf("%3s",sales[i][j]==0? "*":sales[i][j]+"");
				/*
				 * if(sales[i][j]==0){
				 * 	System.out.print("*");
				 * }else{
				 *	System.out.print(sales[i][j])
				 * }
				 */
			}
			System.out.printf("|%4d%n",mTotal);
		}
	}

}
