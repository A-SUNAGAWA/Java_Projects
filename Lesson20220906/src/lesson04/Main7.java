package lesson04;

public class Main7 {

	public static void main(String[] args) {

		int[] nums = new int[4];

		System.out.print("ソート前:");
		for(int i=0;i<nums.length;i++) {
			nums[i] = new java.util.Random().nextInt(10);
			System.out.print(nums[i]);
		}

		for (int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(j != nums.length-1 && nums[j]<nums[j+1]) {
					int exit = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = exit;
				}
			}
		}

		System.out.print("\nソート後:");
		for(int i:nums) {
			System.out.print(i);
		}

	}

}
