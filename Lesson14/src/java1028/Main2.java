package java1028;

public class Main2 {

	public static void main(String[] args) {
		Hero.money = 100;
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero.setRandomMoney();
		System.out.println(Hero.money);
	}

}
