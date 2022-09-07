package java1020_Rensyu;

public abstract class Asset {
	String name;
	int price;

	public Asset(String n, int p) {
		this.name = n;
		this.price = p;
	}

	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
}
