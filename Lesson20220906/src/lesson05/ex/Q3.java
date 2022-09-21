package lesson05.ex;

public class Q3 {

	public static void main(String[] args) {
		kuku(7);// 7の段だけ

		for( int i = 1 ; i <= 9 ; i++ ){// 九九表
			kuku(i);
		}
	}

	public static void kuku(int num) {
		for( int i = 1 ; i <= 9 ; i++ ){
			System.out.printf( " %2d", num * i );
		}
		System.out.println();
	}
}
