package lesson05.ex;

public class Q4 {
	public static void main(String[] args) {
		System.out.print("数値を入力>>");
		int num = new java.util.Scanner(System.in).nextInt();
		if(isZoro(num)) {
			System.out.println(num + "はゾロ目です");
		}else {
			System.out.println(num + "はゾロ目ではありません");
		}
	}

	public static boolean isZoro(int n){
		if(n < 9){
			return false;
		}
		char[] arr = String.valueOf(n).toCharArray();
		char first = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] != first){
				return false;
			}
		}
			return true;
	}
}
