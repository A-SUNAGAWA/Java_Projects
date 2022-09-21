

public class Q9 {
	public  static void main(String[] args){
		int sum=0;
		int count=5;
		while(count > 0){
			int num=new java.util.Random().nextInt(10);
			sum += num;
			count--;
		}
		System.out.println("5個の数値の合計は"+sum+"平均は"+sum/5.0);
	}
}