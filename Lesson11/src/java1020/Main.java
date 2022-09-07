package java1020;

public class Main {

	public static void main(String[] args) {
		Fool f = new Fool();
		Matango m = new Matango('A');
		f.name = "Who";
		f.attack(m);
		f.run();
	}

}
