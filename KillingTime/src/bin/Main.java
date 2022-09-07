package bin;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int r = i * j;
				if(r < 10) {
					String rs = " " + r;
					System.out.print(rs);
				}else {
					System.out.print(r);
				}
			}
			System.out.println();
		}

	}

}
