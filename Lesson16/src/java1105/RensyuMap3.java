package java1105;

import java.util.HashMap;
import java.util.Map;

public class RensyuMap3 {

	public static void main(String[] args) {
		Map<String, Map<String, Integer>> map = new HashMap<>();

		map.put("果物", new HashMap<String, Integer>());
		map.get("果物").put("みかん", 500);
		map.get("果物").put("りんご", 300);

		map.put("野菜", new HashMap<String, Integer>());
		map.get("野菜").put("キャベツ", 200);
		map.get("野菜").put("トマト", 100);

		for(String key : map.keySet()) {
			for(String key2 : map.get(key).keySet()) {
				System.out.println(key+":"+key2+"の値段は"+map.get(key).get(key2)+"円です");
			}
		}

	}

}
