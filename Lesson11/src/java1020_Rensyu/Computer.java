package java1020_Rensyu;

public class Computer extends TangibleAsset{
	String makerName;

	public Computer(String n, int p, String c, String m, double w) {
		super(n, p, c, w);
		this.makerName = m;
	}

	public String getMakerName() {
		return this.makerName;
	}
}
