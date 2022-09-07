package java1028;

public abstract class OfficeWorker {

	String name;

	public OfficeWorker(String name){
		this.name = name;
	}

	public void introduce() {
		System.out.println("はじめまして。私は" + this.name + "です。");
	}

	public abstract void work();

}
