package java1112;

import java.util.Scanner;

public class PCApp {

	public static void main(String[] args) {
		UsbConnectable[] device = {new Mouse(),new Memory(),new CardReader()};
		PC pc = new PC();
		do {
			System.out.print("0.アプリ実行,1.USBデバイス操作,2.終わり >");
			int sr = new Scanner(System.in).nextInt();
			switch(sr) {
			case 0:
				pc.execApp();
				break;
			case 1:
				System.out.print("どのデバイスを接続しますか0.マウス、1.メモリー、2.カードリーダー >");
				int i = new Scanner(System.in).nextInt();
				pc.setDevice(device[i]);
				pc.usb();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}while(true);
	}

}
