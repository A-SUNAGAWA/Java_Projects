package java1105;

public class Main4 {

	public static void main(String[] args) {
		try {
			throw new UMFE("未対応のファイルです");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
