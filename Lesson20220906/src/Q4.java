

public class Q4 {
	public static void main(String[] args) {
		int num=new java.util.Random().nextInt(10)+1;
		if(num % 2 == 0){
			System.out.println(num+"は偶数(even)");
		}else{
			System.out.println(num+"は奇数(odd)");
		}
	}
}