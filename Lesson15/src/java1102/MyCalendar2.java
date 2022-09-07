package java1102;

import java.util.Calendar;

public class MyCalendar2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//実行時の日付/時刻情報を持つ
		//カレンダーインスタンス作成(2021/11/02 18:00:00)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int today = cal.get(Calendar.DATE);
		System.out.printf("%16d/%d%n", year,month);
		cal.set(Calendar.DATE, 1);
		//インスタンスの持つ日付情報を1日に変更(2021/11/01 18:00:00)
		int blank = cal.get(Calendar.DAY_OF_WEEK)-1;
		//DAY_OF_WEEKでその日の曜日を返す2021/11/01は月曜なので2
		//(日曜:1,月:2,火:3....土:7)
		//カレンダー的な最初の空白の数は以上の式で表せる
		//(1日が金なら空白は日、月、火、水、木の5個)
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//その月が何日まであるかは以上のメソッドで求められる
		//(11月は30日)
		String[] weeks = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for(String s : weeks) {
			System.out.printf("%4s",s);
		}
		System.out.println();//曜日の改行
		for(int i = 1; i <= blank + daysCount; i++) {
			//空白と日数分ループを回す
			String str = "";//空白は空文字
			if(i > blank) {//空白が終わったら実行される
				int date = i - blank;
				//カウンター変数iから求める実際の日付
				str = String.valueOf(date);//String型に変換
				if(date == today) {
					str = "*" + str;//現在の日付に*をつける
				}
			}
			System.out.printf("%4s",str);
			//4文字分のスペースを使って描画
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
