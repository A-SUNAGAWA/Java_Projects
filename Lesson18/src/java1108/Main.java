package java1108;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("data.txt");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();

		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while(input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();
	}

}
