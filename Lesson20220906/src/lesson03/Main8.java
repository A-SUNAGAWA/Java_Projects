package lesson03;

public class Main8 {

	public static void main(String[] args) {

		int max,mid,min;

		int num1 = new java.util.Random().nextInt(10);
		int num2 = new java.util.Random().nextInt(10);
		int num3 = new java.util.Random().nextInt(10);

		max = Math.max(Math.max(num1, num2), num3);
		min = Math.min(Math.min(num1, num2), num3);

		if(max == num1) {
			mid = min == num2 ? num3 : num2;
		}else if(max == num2) {
			mid = min == num1 ? num3 : num1;
		}else {
			mid = min == num1 ? num2 : num1;
		}

		System.out.printf("ソート前:%d,%d,%d\n",num1,num2,num3);
		System.out.printf("ソート後:%d,%d,%d",max,mid,min);
	}

}
