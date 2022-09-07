package java1028;

public class OrdinaryOfficeWorker extends OfficeWorker{

	public OrdinaryOfficeWorker (String name) {
		super(name);
	}

	public void work(){
		System.out.println(this.name + "は9時から5時まで働いている。遅刻や欠勤はない");
	}
}
