package rensyu2;

public class Rensyu1 {

	public static void main(String[] args) {
		int hantei = 0;
		int[] index = new int [100];
		for(int i = 0; i < 100; i++) {
			int ransu = new java.util.Random().nextInt(100) + 1;
			index[i] = ransu;
		}
		for(int i = 0; i < 100; i++) {
			if(index[i] == 77) {
				System.out.println("インデックス" + i + "が77です");
				break;
			}else{
				hantei++;
			}if(hantei == 100) {
				System.out.println("含まれていない");
			}

		}
	}

}
