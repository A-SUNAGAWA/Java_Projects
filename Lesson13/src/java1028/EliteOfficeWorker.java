package java1028;

public class EliteOfficeWorker extends OfficeWorker{

	public EliteOfficeWorker(String name) {
		super(name);
	}

	public void work(){
		System.out.println(this.name + "は仕事が早い！しかも正確だ。");
	}

}
