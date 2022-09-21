
public class Q31 {

	public static void main(String[] args) {
		System.out.print("文章を入力してください>");
		String s=new java.util.Scanner(System.in).nextLine();
		char[] c=String.valueOf(s).toCharArray();
		boolean isKaibun = false;
		for(int i=0;i<c.length;i++) {
			if(c[i]==c[c.length-(i+1)]) {
				isKaibun=true;
			}else {
				isKaibun=false;
			}
		}
		System.out.println(isKaibun?"回文です":"回文ではありません");
	}

}
