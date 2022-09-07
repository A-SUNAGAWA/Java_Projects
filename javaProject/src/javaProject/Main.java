package javaProject;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			int saikoro = new java.util.Random().nextInt(6) + 1;
			System.out.println(saikoro);
		}
	}

}
