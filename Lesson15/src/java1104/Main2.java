package java1104;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {

	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		LocalDate l2 = l1.plusDays(100);
		String s = l2.format(fmt);
		System.out.println(s);
	}

}
