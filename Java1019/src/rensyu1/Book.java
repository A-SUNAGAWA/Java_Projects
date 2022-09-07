package rensyu1;

public class Book {

	int page;
	int price;

	public Book(int page, int price){
		this.page = page;
		this.price = price;
	}

	public void info() {
		System.out.println("ページ数:" + this.page + "\n価格:" + this.price);
	}

}
