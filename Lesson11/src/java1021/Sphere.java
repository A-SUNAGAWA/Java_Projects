package java1021;

public class Sphere implements SolidFigure{
	double r;

	public Sphere(double r) {
		this.r = r;
	}

	public void displayAreaInfo() {
		double taiseki = 4 / 3 * Math.PI * Math.pow(this.r, 3);
		double menseki = 4 * Math.PI * Math.pow(this.r, 2);
		System.out.println("球 半径=" + this.r);
		System.out.println("体積=" + taiseki);
		System.out.println("面積=" + menseki);
	}

}
