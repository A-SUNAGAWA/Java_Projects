

/*
 Q23
1~20を順番に出力する。ただし、３の倍数は出力しない。
(continueを用いる)

[実行例]
1
2
4
5
7
8
10
11
13
14
16
17
19
20
 */
public class Q23 {

	public static void main(String[] args) {
		// ①1~20の繰り返しを作る
		for (int i = 1; i <= 20; i++) {
			// ③もし3の倍数だったら
			if (i % 3 == 0) {
				// ④次のループへ行く
				continue;
			}
			// ②iを出力する
			System.out.println(i);
		}

	}

}
