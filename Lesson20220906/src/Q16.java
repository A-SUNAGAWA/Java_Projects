

public class Q16 {
	public static void main(String[] args) {
		int count=0;
		int num;
		do{
			num=new java.util.Random().nextInt(101);
			count++;
		}while(num != 100);
		System.out.println(count+"回目に100が出ました！");
	}
}