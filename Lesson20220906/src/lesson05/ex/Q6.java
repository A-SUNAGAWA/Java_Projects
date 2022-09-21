package lesson05.ex;

import java.util.Arrays;

public class Q6 {
	public static int[] mekeArrFirstToLast(int first,int last){
		//絶対値を使って要素数を求め配列をnewする。
		int[] retArr = new int[Math.abs(first-last)+1];
		for(int i = 0; i < retArr.length; i++){
			if(first < last) {
				retArr[i] = first;
				first++;
			}else {
				retArr[i] = first;
				first--;
			}
		}
		return retArr;
	}

	public static void main(String[] args) {
		int[] arr = mekeArrFirstToLast(4,-2);
		System.out.println(Arrays.toString(arr));
	}
}
