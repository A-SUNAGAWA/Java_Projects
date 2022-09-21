
public class Q29 {

	public static void main(String[] args) {
		String[] id={"A01", "B02", "C03"};
		int[] pw={111, 222, 333};
		System.out.print("IDを入力してください>");
		String enterId=new java.util.Scanner(System.in).nextLine();
		System.out.print("パスワードを入力してください>");
		int enterPw=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<3;i++) {
			if(enterId.equals(id[i]) && enterPw==pw[i]) {
				System.out.println("ログインしました。");
				System.out.println(id[i]+"さんこんにちは。");
				break;
			}
		}
	}

}
