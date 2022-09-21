package lesson05.ex;

public class Q5 {
	static void printSquare(char c , int width){
		for(int i = 0; i < width; i++){
			for(int j = 0; j < width; j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.print("一文字入れてください>");
		String s = new java.util.Scanner(System.in).nextLine();
		// Stringからcharとして取り出す。
		char c = s.charAt(0);
		System.out.print("幅を入れてください>");
		int width = new java.util.Scanner(System.in).nextInt();
		printSquare(c, width);
	}
}
