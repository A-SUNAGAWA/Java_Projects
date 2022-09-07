package java1020_Rensyu;

public abstract class TangibleAsset extends Asset implements Thing{

	String color;
	double weight;

	public TangibleAsset(String n, int p, String c, double w){
		super(n, p);
		this.color = c;
		this.weight = w;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double w) {
		this.weight = w;
	}

	public String getColor() {
		return this.color;
	}

}
