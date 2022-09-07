package java1102_rensyu;

public class Main15_1 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		for(int i = 0;i < 100;i++) {
			s.append(i+1).append(",");
		}
		System.out.println(s);
		String str = s.toString();
		String[] a = str.split(",");
	}

}
