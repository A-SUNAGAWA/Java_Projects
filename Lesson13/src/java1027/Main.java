package java1027;

public class Main {

	public static void kaidan(int dan) {
		for(int i = dan; i >= 0; i--) {
			for(int t = i; t < dan; t++) {
				System.out.print(new java.util.Random().nextInt(100) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.print("何段>");
		int dan = new java.util.Scanner(System.in).nextInt();
		kaidan(dan);
	}

}
