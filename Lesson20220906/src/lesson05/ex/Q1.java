package lesson05.ex;

public class Q1 {
	public static void main(String[] args) {
		System.out.print("整数>");
		int num = new java.util.Scanner(System.in).nextInt();
		String str;
		if(isEven(num)){
			str = "整数";
		}else{
			str = "奇数";
		}
		System.out.printf("%dは%sです",num,str);
	}

	public static boolean isEven(int n){
		return n % 2 == 0;
	}
}
