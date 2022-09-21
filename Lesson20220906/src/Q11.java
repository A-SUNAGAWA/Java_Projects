

public class Q11 {
	public static void main(String[] args) {
		System.out.print("10月は英語で何?>");
		String ans=new java.util.Scanner(System.in).nextLine();
		if(ans.equals("October")){
			System.out.println("OK!");
		}else{
			System.out.println("NG");
		}
	}
}