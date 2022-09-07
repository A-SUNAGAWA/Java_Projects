package java1104;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int day = c.get(Calendar.DAY_OF_MONTH)+100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date d2 = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d2);
		System.out.println(s);



	}

}
