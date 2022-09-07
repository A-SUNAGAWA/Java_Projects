package java1026;

public class Wand {
	private String name;
	private double power;

	public String getName() {return this.name;}

	public void setName(String n) {
		if(n == null || n.length() <= 2) {
			throw new IllegalArgumentException("3文字以上を指定してください");
		}
		this.name = n;
	}

	public double getPower() {return this.power;}

	public void setPower(double p) {
		if(p < 0.5 || p > 100) {
			throw new IllegalArgumentException("値が小さすぎるか、大きすぎます");
		}
		this.power = p;
	}

}
