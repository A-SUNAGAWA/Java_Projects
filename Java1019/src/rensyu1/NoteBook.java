package rensyu1;

public class NoteBook extends Book{

	String content = "";

	public NoteBook(int pa, int pr){
		super(pa, pr);
	}

	public void kakikomi(String naiyou) {
		this.content += naiyou;

	}

	public void hyoji() {
		super.info();
		System.out.println("内容:" + this.content);
	}

}
