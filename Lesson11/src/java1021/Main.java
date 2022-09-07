package java1021;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		do {
			System.out.print("1. 立方体 / 2. 球 / 3. 終了 >");
			int select = new Scanner(System.in).nextInt();
			switch(select) {
			case 1:
				System.out.print("1辺の長さを入力してください >");
				double cw = new Scanner(System.in).nextDouble();
				Cube c = new Cube(cw);
				c.displayAreaInfo();
				continue;
			case 2:
				System.out.print("半径を入力してください >");
				double sr = new Scanner(System.in).nextDouble();
				Sphere s = new Sphere(sr);
				s.displayAreaInfo();
				continue;
			default:
				System.out.println("アプリケーションを終了します。");
				break;
			}
			break;
		}while(true);
	}

}
