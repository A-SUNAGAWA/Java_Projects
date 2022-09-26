package lesson06;

public class Main3 {

	public static void main(String[] args) {

		int someNum = 3;
		String[] copy = new String[someNum];
		String str = "Hello";

		for(int i=0;i<copy.length;i++) {
			copy[i]=str;
		}

		for(String s:copy) {
			System.out.println(s);
		}

	}

}
