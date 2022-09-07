package java1020_2;

public class KyotoCleaningShop implements CleaningService, Cleaning{
	String ownerName;
	String address;
	String phone;

	//シャツを洗う
	public Shirt washShirt(Shirt s) {
		System.out.println("大型洗濯機15分");
		return s;
	}

	//タオルを洗う
	public Towl washTowl(Towl t) {
		System.out.println("大型洗濯機10分");
		return t;
	}

	//コートを洗う
	public Coat washCoat(Coat c) {
		System.out.println("ドライ20分");
		return c;
	}

	public void washAll(Shirt s, Towl t, Coat c) {
		System.out.println("大型洗濯機15分、10分、ドライ20分");
	}

}
