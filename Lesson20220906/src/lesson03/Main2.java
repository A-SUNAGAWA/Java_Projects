package lesson03;

public class Main2 {

	public static void main(String[] args) {
		int isHungry = 1;
		String food = "りんご";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("腹ペコです");
			System.out.printf("%sをいただきます\n",food);
		}
		System.out.println("ごちそうさまでした");
	}

}
