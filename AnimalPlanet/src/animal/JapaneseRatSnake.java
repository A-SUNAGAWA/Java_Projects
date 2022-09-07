package animal;

public class JapaneseRatSnake extends Reptiles implements Swim{


	public JapaneseRatSnake() {
		super("アオダイショウ", 200, 'F', true, true);
	}


	public void diving() {System.out.println(this.name + "は、潜ることができない。");}

	public void swimming() {
		System.out.println(this.name + "は、水辺を泳いだ。");
	}

	public void moving() {
		System.out.println(this.name + "は、スルスルと移動した。");
	}

	public void eating(Animal animal) {
		int a = new java.util.Random().nextInt(3);
		switch(a) {
			case 0:
				if (this.getBodyLength() > animal.getBodyLength()) {
					System.out.println(this.name + "は、" + animal.getName() + "を丸呑みした。");
					animal.died();
					break;
				}else {
					System.out.println(this.name + "は、" + animal.getName() + "を呑み込めなかった。");
					break;
				}
			case 1:
				System.out.println(this.name + "は、卵を丸呑みした。");
				break;
			case 2:
				System.out.println(this.name + "は、ネズミを丸呑みした。");
				break;
		}
	}

	public void layingEggs() {
		if(this.gender == 'F') {
			int count = 0;
			int s = new java.util.Random().nextInt(14)+4;
			System.out.println(this.name + "は、" + s + "個の卵を産んだ。");
			for(int i = 0; i < s; i++) {
				int p = new java.util.Random().nextInt(100);
				if(p < 50) {
					count++;
				}
			}
			System.out.println(count + "個が孵化した。");
		}
	}


}
