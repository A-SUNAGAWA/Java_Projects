package rensyu1;

public class BookApp {

	public static void main(String[] args) {

		System.out.print("本のページ数を入力して下さい >");
		int page = new java.util.Scanner(System.in).nextInt();
		System.out.print("本の価格を入力して下さい >");
		int price = new java.util.Scanner(System.in).nextInt();
		//入力内容を引数として本のインスタンス生成
		Book book = new Book(page,price);

		System.out.print("ノートのページ数を入力して下さい >");
		page = new java.util.Scanner(System.in).nextInt();;
		System.out.print("ノートの価格を入力して下さい >");
		price = new java.util.Scanner(System.in).nextInt();;
		// 入力内容を引数としてノートのインスタンス生成
		NoteBook notebook = new NoteBook(page,price);
		while(true) {
			System.out.println("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書き込み / 4. 終了");
			int s = new java.util.Scanner(System.in).nextInt();

			switch(s) {
			case 1:
				book.info();
				continue;
			case 2:
				notebook.hyoji();
				continue;
			case 3:
				System.out.print("書き込む内容を入力してください>");
				String n = new java.util.Scanner(System.in).nextLine();
				notebook.kakikomi(n);
				continue;
			default:
				System.out.println("アプリケーションを終了します");
				break;
			}
			break;
		}
	}

}
