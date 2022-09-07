package java1025_2;

public class Main {

	public static void main(String[] args) {
		X obj = new A();
		Y y1 = new A();
		Y y2 = new B();

		obj.a();
		y1.a();
		y2.a();

		Y[] yh = {new A(), new B()};
		for (Y y : yh) {
			y.b();
		}
	}

}
