package java1112;

public abstract class Person {
	private String name;
	private int age;
	public Person(String s,int i) {
		setName(s);
		setAge(i);
	}

	public String getName() {return this.name;}

	public int getAge() {return this.age;}

	public void setName(String n) {this.name = n;}

	public void setAge(int a) {this.age = a;}

	public abstract void showMe();

}
