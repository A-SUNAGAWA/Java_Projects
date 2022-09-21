

public class Q13 {
	public static void main(String[] args) {
		System.out.print("日本の信号で渡っていい色は(漢字一文字)>");
		String ans=new java.util.Scanner(System.in).nextLine();
		switch(ans){
		case "緑":
		case "青":
			System.out.println("OK!");
			break;
		default:
			System.out.println("NG");
		}
	}
}