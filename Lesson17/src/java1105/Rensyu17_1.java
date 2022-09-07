package java1105;

public class Rensyu17_1 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerExceptionをcatchしました");
			System.out.println("――スタックトレース(ここから)――");
			e.printStackTrace();
			System.out.println("――スタックトレース(ここまで)――");
		}
	}

}
