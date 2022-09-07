package java1020;
import java.util.Random;
import java.util.Scanner;

public class Monty {
	public static void main(String[] args){
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);

		boolean[] hasTreasure=new boolean[3];
		int luckyNo=rand.nextInt(3);
		hasTreasure[luckyNo]=true;

		System.out.println("３つの扉のうちどれか一つの扉の向こうにお宝があります");
		System.out.print("0,1,2どの扉を選びますか(0,1,2)＞");
		int choice=scan.nextInt();

		System.out.printf("%d番の扉をお選びですね。%n", choice);
		System.out.println("私が残りの扉の中をこっそり見てきます...");
		int diff=rand.nextInt(2)+1;

		int emptyIndex=hasTreasure[(choice+diff)%3] ? (choice+(diff==1? 2:1))%3:(choice+diff)%3;
		System.out.printf("%d番の扉の後ろには何もありません！%n",emptyIndex);
		System.out.print("ここで改めてお聞きします、何番の扉を選びますか(0,1,2)>");
		choice=scan.nextInt();

		String msg=hasTreasure[choice] ? "おめでとうございます！お宝GETです！！":"残念、ハズレです。";
		System.out.println(msg);
	}
}