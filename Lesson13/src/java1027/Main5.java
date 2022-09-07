package java1027;

public class Main5 {

	static int goukei(int a, int b, int c) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		int sum = 0;
		switch(c) {
		case 1:
			for(int i = small; i < big; i++) {
				if(i % 2 == 0) {
					sum += i;
				}
			}
			break;
		case 2:
			for(int i = small; i < big; i++) {
				if(i % 2 != 0) {
					sum += i;
				}
			}
			break;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.print("整数1を入力>");
		int one = new java.util.Scanner(System.in).nextInt();
		System.out.print("整数2を入力>");
		int two = new java.util.Scanner(System.in).nextInt();
		System.out.print("偶数(1)、奇数(2)を選択>");
		int three = new java.util.Scanner(System.in).nextInt();
		String num = "";
		switch(three) {
		case 1:
			num = "偶数";
			break;
		case 2:
			num = "奇数";
			break;
		}
		System.out.println(Math.min(one, two) + "から" + Math.max(one, two) + "までの" + num +"の合計は" + goukei(one,two,three) + "です。");
	}

}
