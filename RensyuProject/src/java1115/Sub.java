package java1115;

public class Sub {

	public Circle CircleCalc(int r) {
		double ensyu = 2 * r * 3.14;
		double menseki = r * r * 3.14;
		Circle c = new Circle(ensyu,menseki);
		return c;
	}
}
