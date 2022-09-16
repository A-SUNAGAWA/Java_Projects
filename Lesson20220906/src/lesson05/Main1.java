package lesson05;

public class Main1 {

	public static void main(String[] args) {
		introduceOneself();
		email("タイトル","アドレス","本文");
		email("アドレス","本文");
		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は"+calcTriangleArea(10.0,5.0)+"㎠");
		System.out.println("円の半径が5.0cmの場合、面積は"+calcCircleArea(5.0)+"㎠");
	}

	public static void introduceOneself() {
		String name = "太郎";
		int age = 20;
		double height = 170.0;
		char eto = '亥';
		System.out.println("名前は"+name+"、年齢は"+age+"、身長は"+height+"、干支は"+eto+"です。");
	}

	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名："+title);
		System.out.println("本文："+text);
	}

	public static void email(String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文："+text);
	}

	public static double calcTriangleArea(double bottom,double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
