package lesson04;

public class Main6 {

	public static void main(String[] args) {

		String[][] foods = {{"中華", "イタリア", "香川"}, {"ラーメン", "パスタ", "うどん"}};
		
		String chose = new java.util.Scanner(System.in).nextLine();
		
		for (int i=0;i<foods[0].length;i++) {
			if(chose.equals(foods[0][i])) {
				System.out.println(foods[1][i]);
			}
		}
		
	}

}
