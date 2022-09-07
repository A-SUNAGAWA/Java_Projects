package animal;

// ワニ。名前、性別を指定してもいいし、しなくてもいい

public class Crocodile extends Reptiles implements Swim{
	// ワニが水中にいるかを判定するフィールド変数
	private boolean inWater;

	public Crocodile() {
		//	体長はcm(参照:ナイルワニ)
		super("ワニ", 500, 'M', true);
	}

	public Crocodile(char Gender) {
		// 性別を選ぶ場合のコンストラクタ
		super("ワニ", 500, Gender, true);
	}

	public Crocodile(String name) {
		// 名前を選ぶ場合のコンストラクタ。先頭に強制的に「ワニ」とつく
		super("ワニ" + name, 500, 'M', true);
	}

	public Crocodile(String n, char g) {
		// 名前、性別を選ぶ場合のコンストラクタ
		super("ワニ" + n, 500, g, true);
	}

	private String isC(boolean c) {
		// 「肉食」「草食」を文字化して返すメソッド
		// Mainで呼び出す必要がないので不可視化

		if(c) {
			String hantei = "肉食";
			return hantei;
		}else {
			String hantei = "草食";
			return hantei;
		}
	}

	public void info() {
		// 自己紹介メソッド
		System.out.println("名前:" + this.getName());
		System.out.println("体長:" + this.getBodyLength());
		System.out.println("性別:" + this.getGender());
		System.out.println("食性:" + this.isC(this.isCarnivorous()));
	}

	public void inWater(boolean change) {
		// ワニが水の中に入るメソッド
		if(change) {
			System.out.println(this.name + " は水の中に入った");
			this.inWater = true;
		}else {
			System.out.println(this.name + " は岸に上がった");
			this.inWater = false;
		}
	}

	public void swimming() {
		// 実はMainから呼び出す必要がないが、継承してきたものなので不可視化できない
		// 水の中にいないと泳げない。
		if(this.inWater) {
			System.out.println(this.name + " は泳いだ");
		}else {
			System.out.println(this.name + " は陸にいる");
		}

	}

	public void diving() {
		// 水の中にいないと潜れない
		if(this.inWater) {
			System.out.println(this.name + " は潜った");
		}else {
			System.out.println(this.name + " は陸にいる");
		}
	}

	public void moving() {
		// 水の中にいると自動的に泳ぐ
		if(!this.inWater) {
			this.swimming();
		}else {
			System.out.println(this.name + " はのそのそ歩いた");
		}
	}

	public void biting(Animal animal) {
		// 噛みつくメソッド。Mainから呼び出してもいいが特に何も処理しない
		// 小さい動物には噛みつけない(噛みつく必要がない)
		if(animal.bodyLength > 100) {
			System.out.println(this.name + "は" + animal.name + "に噛みついた！");
		}
	}

	public void eating(Animal animal) {
		// 水の中にいた場合、水から飛び出してくる(水中生物は考慮していない)
		// 大きい動物な場合、噛みついてから食べる
		if(inWater) {
			System.out.println(this.name + " が水の中から飛び出してきた！");
			this.biting(animal);
			super.eating(animal);
		}else {
			this.biting(animal);
			super.eating(animal);
		}

	}

	public void moulting() {
		// ワニの脱皮は一枚を脱ぐ感じではないらしい
		System.out.println(this.name + "の古い角質が剥がれ落ちた");
	}

	public void died() {
		// 水中のワニを食べようとした場合、泳いで逃げていく
		if(this.inWater) {
			System.out.println(this.name + "は泳いで逃げていった…");
		}else {
			super.died();
		}
	}




}
