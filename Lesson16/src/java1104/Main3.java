package java1104;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Main3 {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		ArrayList<Book> book = new ArrayList<>();
		book.add(new Book("a",sdf.parse("2021/11/11")));
		book.add(new Book("a",sdf.parse("2021/11/11")));
		Iterator<Book> i = book.iterator();
		while(i.hasNext()) {
			Book b = i.next();
			System.out.println("タイトル:" + b.title + "\n発行日:" + sdf.format(b.bdate));
		}
	}

}
