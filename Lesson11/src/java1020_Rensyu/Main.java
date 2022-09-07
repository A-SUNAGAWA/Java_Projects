package java1020_Rensyu;

public class Main {

	public static void main(String[] args) {
		Book b = new Book("A", 100, "青", "B", 1.2);
		Computer c = new Computer("C", 10000, "白", "D", 8.0);

		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.color);
		System.out.println(b.isbn);
		System.out.println(b.weight);
		System.out.println(c.name);
	}

}
