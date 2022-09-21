

/*
 Q21
 0~999の乱数を繰り返し生成し、777が出るまでの回数を求める。
 (while(true)を使うこと　）

 [実行例]
 777は509回目に出ました。
 */
public class Q21 {

	public static void main(String[] args) {
		//①回数を数える用の変数を用意
		int count = 0;
		//②while(true)の無限ループを作成
		while(true){
			//③①で作成した変数の値を1増やす
			count++;
			//④0~999の乱数を作成
			int random = new java.util.Random().nextInt(1000);
			//趣旨とは別に何回か確認用
			System.out.println(random);
			//⑤もし④で作成した乱数が777の時
			if(random == 777){
				//⑥ループを終了する
				break;
			}
		}
		//⑦777は①回目に出ました。と表示
		System.out.println("777は"+ count + "回目に出ました。");
	}
}
