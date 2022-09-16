package lesson04;

public class Main4 {

	public static void main(String[] args) {

		int[] nums = new int[5];
		int maxNumsIndex = 0;
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = new java.util.Random().nextInt(10);
			System.out.print(nums[i]);
			maxNumsIndex = nums[i] >= nums[maxNumsIndex] ? i : maxNumsIndex;
		}
		
		System.out.println(" "+maxNumsIndex);
	}

}
