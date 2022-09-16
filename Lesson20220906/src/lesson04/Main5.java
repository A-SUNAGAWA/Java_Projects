package lesson04;

public class Main5 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		for(int i=0;i<nums.length;i++) {
			nums[i] = new java.util.Random().nextInt(10);
			System.out.print(nums[i]);
		}
		System.out.print(" ");
		for(int i=nums.length-1;i>=0;i--) {
			System.out.print(nums[i]);
		}

	}

}
