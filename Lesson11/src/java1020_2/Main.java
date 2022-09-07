package java1020_2;

public class Main {

	public static void main(String[] args) {
		Shirt s = new Shirt();
		Towl t = new Towl();
		Coat c = new Coat();
		KyotoCleaningShop kcs = new KyotoCleaningShop();
		kcs.washShirt(s);
		kcs.washTowl(t);
		kcs.washCoat(c);
		kcs.washAll(s, t, c);
	}
}