package java1020_Rensyu;

public class Book extends TangibleAsset{
	String isbn;

	public Book(String n, int p, String c, String i, double w){
		super(n, p, c, w);
		this.isbn = i;

	}

	public String getIsbn() {
		return this.isbn;
	}
}
