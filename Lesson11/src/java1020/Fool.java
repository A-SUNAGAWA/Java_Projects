package java1020;

public class Fool extends Character implements Human{
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

	public void talk() {

	}
	public void watch() {

	}
	public void hear() {

	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");

	}



}
