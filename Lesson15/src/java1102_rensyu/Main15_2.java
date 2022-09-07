package java1102_rensyu;

public class Main15_2 {

	public String add(String folder, String file) {
		if(!(folder.endsWith("\\"))) {
			folder += "\\";
		}
		return folder + file;
	}

	public static void main(String[] args) {

	}

}
