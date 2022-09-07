package fukusyu;

public class Q1 {

	public static boolean tf(int num) {
		boolean hantei;
		if(num % 2 == 0) {
			hantei = true;
		}else {
			hantei = false;
		}
		return hantei;

	}

	public static void main(String[] args) {
		while(true) {
			System.out.print("整数(0を入力するとプログラム終了)>");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == 0){
				break;
			}
			if(tf(num)) {
				System.out.println(num + "は偶数です");
			}else {
				System.out.println(num + "は奇数です");
			}
		}
		System.out.println("終了");
	}

}
