package fukusyu;
import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		System.out.print("x >");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.print("y >");
		Scanner s2 = new Scanner(System.in);
		int y = s2.nextInt();
		if(x > y) {
			System.out.println("xはyより大きい");
		}
	}

}
