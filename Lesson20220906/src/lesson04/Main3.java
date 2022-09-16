package lesson04;

public class Main3 {

	public static void main(String[] args) {

		int[][] primeNumbers = {{2, 3, 5, 7}, {11, 13, 17, 19}, {23, 29, 31, 37}};

		for(int i=0;i<primeNumbers.length;i++) {
			for(int j=0;j<primeNumbers[i].length;j++) {
				System.out.print(primeNumbers[i][j]);
			}
			System.out.println("");
		}

	}

}
