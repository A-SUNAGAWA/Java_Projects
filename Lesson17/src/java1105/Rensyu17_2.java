package java1105;

public class Rensyu17_2 {

	public static void main(String[] args) {
		try{
			int i = 0;
			Integer.parseInt("三", i);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
