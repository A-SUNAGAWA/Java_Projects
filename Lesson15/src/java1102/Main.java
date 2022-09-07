package java1102;

import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		Book b = new Book("Javaプログラミング",f.parse("2021/11/02"));
		System.out.printf("タイトル:%s/発行日:%s",b.title,f.format(b.bdate));

		/*
		 * SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		 * Date d = f.parse("2021/11/02");
		 * Book b = new Book("Javaプログラミング",d);
		 * System.out.printf("タイトル:%s/発行日:%s",b.title,f.format(b.bdate));
		 */
	}

}
