
public class Q30 {

	public static void main(String[] args) {
		String[] suits={"♤","♡","♢","♧"};
		String[] nums={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] cards=new String[52];
		int input=0;
		for(int i=0;i<suits.length;i++) {
			for(int j=0;j<nums.length;j++) {
				cards[input] = suits[i]+nums[j];
				input++;
			}
		}
		for(int i=0;i<cards.length;i++) {
			if(i!=0 && i%13==0) {
				System.out.println("");
			}
			System.out.print(cards[i]);
		}
	}

}
