package java1020;
import java.util.Random;
import java.util.Scanner;

public class Monty2 {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);

		final int TOTAL_COUNT=10000;
		System.out.print("選択を変えない場合のあたり回数:");
		int luckyCount=0;
		for(int i=0;i<TOTAL_COUNT;i++){
			boolean[] hasTreasure=new boolean[3];
			int luckyNo=rand.nextInt(3);
			hasTreasure[luckyNo]=true;
			int choice=0;//最初にどこを選ぶかは確率に影響しないので常に0
			if(hasTreasure[choice]){
				luckyCount++;
			}
		}
		System.out.println(luckyCount);

		System.out.print("選択を変えた場合のあたり回数:");
		luckyCount=0;
		for(int i=0;i<TOTAL_COUNT;i++){

			boolean[] hasTreasure=new boolean[3];
			int luckyNo=rand.nextInt(3);
			hasTreasure[luckyNo]=true;
			int choice=0;
			int diff=rand.nextInt(2)+1;
			int emptyIndex=hasTreasure[(choice+diff)%3] ? (choice+(diff==1? 2:1))%3:(choice+diff)%3;
			if(hasTreasure[emptyIndex==1 ? 2:1]){
				luckyCount++;
			}
		}
		System.out.println(luckyCount);
	}
}