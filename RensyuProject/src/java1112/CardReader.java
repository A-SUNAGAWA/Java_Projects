package java1112;

public class CardReader implements UsbConnectable{
	public void usbConnect() {
		System.out.println("USB接続にてSDカードの読み書きができます。");
	}
}
