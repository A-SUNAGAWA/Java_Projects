package java1028;

public class Main3 {

	public static void main(String[] args) {
		Account a = new Account("1234",5000,"4321");

		System.out.println(a);

		Account b = new Account("1234",10000000,"4321");

		if(a.equals(b)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}

		a.totalBalance();
	}

}
