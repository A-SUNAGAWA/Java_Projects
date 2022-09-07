package java1028;

import static java.lang.System.*;

public class Account {
	String accountNumber;
	int balance;
	String pass = "4321";// パスワード
	private static int totalBalance;// 全口座の残高の総額

	public Account(String num,int bal,String pass){
		this.accountNumber=num;
		this.balance=bal;
		this.pass=pass;
		totalBalance+=balance;
	}

	public Account() {}

	public String toString() {
		return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}

	public static void totalBalance() {
		out.println("全口座の残高の総額は\\" + totalBalance + "です。");
	}

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			if(this.accountNumber.equals(a.accountNumber.trim()) && this.pass.equals(a.pass.trim())){
				return true;
			}
		}
		return false;
	}

}
