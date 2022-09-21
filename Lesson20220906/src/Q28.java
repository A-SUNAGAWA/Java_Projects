
public class Q28 {

	public static void main(String[] args) {
		boolean[] judge={true,false,false,true,true};
		System.out.print("何戦目の結果を調べますか(1~5)>");
		int num=new java.util.Scanner(System.in).nextInt();
		String result;
		if(judge[num-1]) {
			result="勝ち";
		}else {
			result="負け";
		}
		System.out.printf("第%d戦は[%s]です",num,result);
	}

}
