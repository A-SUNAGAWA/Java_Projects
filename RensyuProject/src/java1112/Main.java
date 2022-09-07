package java1112;

public class Main {

	public static void main(String[] args) {
		HonestPerson a = new HonestPerson("正直太郎", 25);
		a.showMe();
		LiePerson b = new LiePerson("嘘つき次郎", 25);
		b.showMe();
	}

}
