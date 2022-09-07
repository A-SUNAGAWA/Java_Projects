package animal;

public class Iguana extends Reptiles implements Swim{

	private boolean swim;//泳げるか

	public Iguana() {
		super("リクイグアナ",120,'M' ,false, false);
		this.swim = false;
	}

	public Iguana(boolean swim) {
		super("ウミイグアナ",150,'M' ,false, false);
		this.swim = swim;
	}

	public void diving() {
		if(this.swim) {
			System.out.println(this.name + "は、海藻を食べるため海に潜った。");
		}else {
			System.out.println(this.name + "は、海に潜ることができなかった。");
		}
	}

	public void swimming() {
		if(this.swim) {
			this.diving();
			System.out.println(this.name + "は、餌のある海底の岩場まで泳いだ。");
		}else {
			System.out.println(this.name + "は、泳ぐことができなかった。");
		}
	}

	public void eating(Animal animal) {
		if(this.swim) {
			System.out.println(this.name + "は、" + animal.getName() + "を食べることができない！");
			System.out.println(this.name + "は、特殊な歯で岩から海藻をこすり取って食べた。");
		}else {
			System.out.println(this.name + "は、" + animal.getName() + "を食べることができない！");
			System.out.println(this.name + "は、サボテンを食べた");
		}
	}

	public void moving() {
		System.out.println(this.name + "は、ノソノソと歩いた。");
	}

}
