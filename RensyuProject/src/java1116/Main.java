package java1116;

public class Main {

	public static void main(String[] args) {
		check(null);
	}

	public static void check(String s) {
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("値がnullです。");
			e.printStackTrace();
		}
	}

}
