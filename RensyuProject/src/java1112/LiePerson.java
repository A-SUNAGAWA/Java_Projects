package java1112;

public class LiePerson extends Person{

	public LiePerson(String s,int i) {
		super(s,i);
	}

	public void showMe() {
		System.out.printf("%s %d歳%n",super.getName(),super.getAge()-5);
	}

}
