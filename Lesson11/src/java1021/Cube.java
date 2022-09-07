package java1021;

public class Cube implements SolidFigure{
	double width;

	public Cube(double w){
		this.width = w;
	}

	public void displayAreaInfo() {
		double taiseki = Math.pow(this.width, 3);
		double menseki = 6 * Math.pow(this.width, 2);
		System.out.println("立方体 1辺の長さ=" + this.width);
		System.out.println("体積=" + taiseki);
		System.out.println("表面積=" + menseki);
	}

}
