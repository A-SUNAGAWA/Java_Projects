package lesson05;

public class Main3 {

	public static int[] allUp(int[] array) {
		int[] updateArray = new int[array.length];
		for(int i=0;i<array.length;i++) {
			updateArray[i] = array[i]+10;
		}
		return updateArray;
	}

	public static void showValue(int[] array) {
		for(int i:array) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		int[] scores = {1,2,3,4,5};
		int[] upscores = allUp(scores);
		showValue(upscores);

	}

}
