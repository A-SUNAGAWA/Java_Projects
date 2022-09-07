package java1116;

import java.time.LocalDate;

public class MyCalendar {

	public static void main(String[] args) {
		LocalDate day = LocalDate.now();
		int today=day.getDayOfMonth();
		System.out.printf("%16d/%d%n",day.getYear(),day.getMonthValue());

		day = day.withDayOfMonth(1);

		int dayCount = day.lengthOfMonth();
		int blank = day.getDayOfWeek().getValue();


		String[] weeks= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for(String s:weeks) {
			System.out.printf("%4s",s);
		}
		System.out.println();

		for(int i=1;i<=blank+dayCount;i++) {
			String str="";
			if(i>blank) {
				int date=i-blank;
				str=String.valueOf(date);
				if(date==today) {
					str="*"+str;
				}
			}

			System.out.printf("%4s", str);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

}
