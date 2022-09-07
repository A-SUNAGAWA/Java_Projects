package java1028;

public class LazyOfficeWorker extends OfficeWorker{

	public LazyOfficeWorker(String name) {
		super(name);
	}

	public void work(){
		System.out.println(this.name + "はPCの画面を即座に切り替えた。何をしていたのだろう。");
	}

}
