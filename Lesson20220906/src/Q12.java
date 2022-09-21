

public class Q12 {
	public static void main(String[] args) {
		System.out.print("スペイン語で日曜は何?1:Lunes,2:Jueves,3:Domingo　>");
		int num=new java.util.Scanner(System.in).nextInt();
		switch(num){
			case 3:
				System.out.println("OK!");
				break;
			default:
				System.out.println("NG");
		}
	}
}