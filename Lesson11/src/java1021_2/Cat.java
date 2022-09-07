package java1021_2;

public abstract class Cat implements Animals{

	String name;
	double size;
	double weight;
	int age;

	public Cat(String n, double s, double w, int a){
		this.name = n;
		this.size = s;
		this.weight = w;
		this.age = a;
	}

	public void makeSound() {
		System.out.println("meow");
	}

	public void walk() {
		System.out.println("cat walk");
	}

	public void eat() {
		System.out.println("cat eat");
	}

	public void tumetogi() {
		System.out.println(this.name + "はキーボードで爪とぎをした。");
		System.out.println("キーボードは壊れた。");
	}

	public abstract void bodyColor();

	public abstract void eyeColor();

	public abstract void traits();

}
