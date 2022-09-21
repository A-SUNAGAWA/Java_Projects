

public class Q10{
	public  static void main(String[] args){
		int times=10;
		int count=0;
		while(times > 0){
			int score=new java.util.Random().nextInt(101);
			if(score >= 50){
				count++;
			}
			times--;
		}
		System.out.println("50以上のscoreは"+count+"個ありました。");
	}
}