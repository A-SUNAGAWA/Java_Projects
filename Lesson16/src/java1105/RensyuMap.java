package java1105;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RensyuMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("月", "Lunes(ルネス)");
		map.put("火", "Martes(マルテス)");
		map.put("水", "Miercoles(ミエルコレス)");
		map.put("木", "Jueves(フエベス)");
		map.put("金", "Viernes(ビエルネス)");
		map.put("土", "Sabado(サバド)");
		map.put("日", "Domingo(ドミンゴ)");
		System.out.println(map.keySet());
		do {
			System.out.print("調べたいスペイン語の曜日を入力してください。>");
			String in = new Scanner(System.in).nextLine();
			if(map.containsKey(in)) {
				System.out.println(in + ":" + map.get(in));
			}else {
				System.out.println("アプリケーションを終了します");
				return;
			}
		}while(true);
	}

}
