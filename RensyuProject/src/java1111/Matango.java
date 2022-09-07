package java1111;

public class Matango extends Monster{

	public Matango(String n) {
		super(n);
		this.hp = 100;
	}

	public void info() {
		System.out.printf("My name is %s, I have %dHP.%n",this.name,this.hp);
	}

	public void voice() {
		System.out.println("AAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH!!!!!");
	}

}
