package java1117;

import java.util.Scanner;

public class App {

	public static void showFile(String fileName) throws UnsupportedPictFileException{

		if(!fileName.contains(".")) {
			throw new UnsupportedPictFileException("Err:拡張子を含めてください。");
		}else if(!fileName.matches(".*[.](jpeg|jpg|png|gif)")||fileName.matches(".*([.].*){2}")) {
			throw new UnsupportedPictFileException("Err:ファイル名が不正です。");
		}else{
			System.out.println(fileName + "を表示します");
		}

	}

	public static void main(String[] args){
		do {
		System.out.print("1.画面表示 2.やめる >");
		int in = new Scanner(System.in).nextInt();
		switch(in) {
		case 1:
			System.out.print("ファイル名を入力してください>");
			String fileName = new Scanner(System.in).next();
			try {
			showFile(fileName);
			}catch(UnsupportedPictFileException e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("アプリを終了します");
			return;
		}
		}while(true);

	}

}

class UnsupportedPictFileException extends Exception{

	public UnsupportedPictFileException(String s) {
		super(s);
	}
}
