package lesson03;

import java.util.Random;

public class Main4 {

	public static void main(String[] args) {

		int max,nextMax,nextMin,min;

		int num1 = new Random().nextInt(10);
		int num2 = new Random().nextInt(10);
		int num3 = new Random().nextInt(10);
		int num4 = new Random().nextInt(10);

//		int num1,num2,num3,num4;
//		num1 = num2 = num3 = num4 = new Random().nextInt(10);

		max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
		min = Math.min(Math.min(num1, num2), Math.min(num3, num4));

		if(max == num1) {
			if(min == num2) {
				nextMax = Math.max(num3, num4);
				nextMin = Math.min(num3, num4);
			}else if(min == num3) {
				nextMax = Math.max(num2, num4);
				nextMin = Math.min(num2, num4);
			}else {
				nextMax = Math.max(num2, num3);
				nextMin = Math.min(num2, num3);
			}
		}else if(max == num2) {
			if(min == num1) {
				nextMax = Math.max(num3, num4);
				nextMin = Math.min(num3, num4);
			}else if(min == num3) {
				nextMax = Math.max(num1, num4);
				nextMin = Math.min(num1, num4);
			}else {
				nextMax = Math.max(num1, num3);
				nextMin = Math.min(num1, num3);
			}
		}else if(max == num3) {
			if(min == num1) {
				nextMax = Math.max(num2, num4);
				nextMin = Math.min(num2, num4);
			}else if(min == num2) {
				nextMax = Math.max(num1, num4);
				nextMin = Math.min(num1, num4);
			}else {
				nextMax = Math.max(num1, num2);
				nextMin = Math.min(num1, num2);
			}
		}else {
			if(min == num1) {
				nextMax = Math.max(num2, num3);
				nextMin = Math.min(num2, num3);
			}else if(min == num2) {
				nextMax = Math.max(num1, num3);
				nextMin = Math.min(num1, num3);
			}else {
				nextMax = Math.max(num1, num2);
				nextMin = Math.min(num1, num2);
			}
		}

		System.out.printf("ソート前:%d,%d,%d,%d\n",num1,num2,num3,num4);
		System.out.printf("ソート後:%d,%d,%d,%d",max,nextMax,nextMin,min);

	}

}
