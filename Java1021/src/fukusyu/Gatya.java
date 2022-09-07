package fukusyu;

public class Gatya {

	public static void gatya(){
		int chosen = new java.util.Random().nextInt(100) + 1;
		if(chosen < 60) {
			System.out.println("星3");
		}else if(chosen < 80){
			System.out.println("星4");
		}else if(chosen < 95){
			System.out.println("星5");
		}else if(chosen < 99) {
			System.out.println("星6");
		}else {
			System.out.println("限定！！！！");
		}
	}

	public static void main(String[] args) {
		while(true) {
			System.out.print("1:単発   2.10連  3.訴訟 >");
			int select = new java.util.Scanner(System.in).nextInt();
			switch(select) {
			case 1:
				gatya();
				break;
			case 2:
				for(int i = 0; i < 10; i++) {
					gatya();
				}
				break;
			case 3:
				System.out.println("YOU BANED!!!!!");
				return;
			}
		}
	}

}
