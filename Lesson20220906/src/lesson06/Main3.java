package lesson06;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

	public static void main(String[] args) {

		int[] nums = {new Random().nextInt(21),new Random().nextInt(21),new Random().nextInt(21)};
		Arrays.sort(nums);
		for(int i:nums) {
			System.out.print(i + " ");
		}
	}

}
