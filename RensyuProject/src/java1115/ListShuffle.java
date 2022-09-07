package java1115;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListShuffle {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		for(int i = 1;i <= 100;i++) {
			num.add(i);
		}

		Collections.shuffle(num);

		System.out.println(num);

		for(int i = 0;i < 10;i++) {
			System.out.println(num.get(i));
		}
	}

}
