package freeZone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FreeZone1 {

	//TimeAPIの練習

	public static void main(String[] args) {
		//ZoneDateTime:		年〇月〇日〇時〇ゾーン〇	厳密な日時情報
		//LocalDateTime:	年〇月〇日〇時〇ゾーン×	日常で使う日時情報
		//LocalDate			年〇月〇日〇時×ゾーン×	LocalDateTimeよりアバウト。誕生日とかに使う
		//LocalTime			年×月×日×時〇ゾーン×	時間だけ。アラームとかに使う
		//Year				年〇月×日×時×ゾーン×	年だけ。著作発表年とかに使う
		//YearMonth			年〇月〇日×時×ゾーン×	年月だけ。カード有効期限とかに使う
		//Month				年×月〇日×時×ゾーン×	月だけ。決済月とかに使う
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm/ss");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today.format(format1));
		System.out.println(today.format(format2));
		System.out.println(today.plusDays(100).format(format2));

	}

}
